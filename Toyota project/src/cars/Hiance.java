package cars;

import characteristics.MachineCharacteristics;
import characteristics.Transmission;
import components.*;

public class Hiance extends Truck {

    public Hiance(Wheels[] wheels, GasTank gasTank, Headlights headlights, Electrician electrician, Engine engine, int liftingCapacity) {
        super(wheels, gasTank, headlights, electrician, engine, liftingCapacity);
    }
}
