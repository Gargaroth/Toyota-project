package cars;

import characteristics.MachineCharacteristics;
import characteristics.Transmission;
import components.*;

public class Dyna extends Truck {
    private static final boolean SOCKETS = true;

    public Dyna(Wheels[] wheels, GasTank gasTank, Headlights headlights, Electrician electrician, Engine engine, int liftingCapacity) {
        super(wheels, gasTank, headlights, electrician, engine, liftingCapacity);
    }

    public void ChargeThePhone() {
        System.out.println("Заряжаю телефон");
    }
}
