package cars;

import characteristics.MachineCharacteristics;
import characteristics.Transmission;
import components.*;

public abstract class Truck extends Car {

    public int liftingCapacity;

    public Truck(Wheels[] wheels, GasTank gasTank, Headlights headlights, Electrician electrician, Engine engine, int liftingCapacity) {
        super(wheels, gasTank, headlights, electrician, engine);
        this.liftingCapacity = liftingCapacity;
    }

    public int getLiftingCapacity() {
        return liftingCapacity;
    }

    public void setLiftingCapacity(int liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }
}
