package cars;

import characteristics.MachineCharacteristics;
import characteristics.Transmission;
import components.*;

public class Camry extends PassengerCar {

    private static final boolean USB = true;

    public Camry(Wheels[] wheels, GasTank gasTank, Headlights headlights, Electrician electrician, Engine engine, boolean haveCruiseControl) {
        super(wheels, gasTank, headlights, electrician, engine, haveCruiseControl);
    }

    public void TurnOnMusic() {
        System.out.println("Включаю музыку");
    }
}
