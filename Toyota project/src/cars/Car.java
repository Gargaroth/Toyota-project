package cars;


import characteristics.MachineCharacteristics;
import characteristics.Transmission;
import components.*;

public abstract class Car {
    public boolean stateOfMotion;
    protected MachineCharacteristics machineCharacteristics;
    protected Transmission transmission;
    protected Wheels[] wheels;
    protected GasTank gasTank;
    protected Headlights headlights;
    protected Electrician electrician;
    protected Engine engine;

    public Car(Wheels[] wheels, GasTank gasTank, Headlights headlights, Electrician electrician, Engine engine) {
        this.wheels = wheels;
        this.gasTank = gasTank;
        this.headlights = headlights;
        this.electrician = electrician;
        this.engine = engine;
    }

    public boolean isStateOfMotion() {
        return stateOfMotion;
    }

    public void Start() throws StartCarException {
        if (wheels.length == 4 && (gasTank.AmountOfGasoline > 0 && electrician.functional && engine.functional)) {
            for (Wheels wheels : wheels) {
                if (!wheels.Pierced) {
                    stateOfMotion = true;
                } else {
                    throw new StartCarException("Ошибка запуска: Колеса проколоты!");
                }
            }
            System.out.println("Машина запустилась");
        } else if (wheels.length != 4) {
            throw new StartCarException("Ошибка запуска: Колес меньше четырех!");
        } else if (gasTank.AmountOfGasoline == 0) {
            throw new StartCarException("Ошибка запуска: Топливо на нуле");
        } else if (!electrician.functional) {
            throw new StartCarException("Ошибка запуска: Электрика не работает");
        } else if (!engine.functional) {
            throw new StartCarException("Ошибка запуска: Двигатель не работает");
        }
    }

    public void Stop() {
        stateOfMotion = false;
    }

    public void TurnOn(Headlights headlights) {
        headlights.functional = true;
        System.out.println("Фары включены");
    }
}


