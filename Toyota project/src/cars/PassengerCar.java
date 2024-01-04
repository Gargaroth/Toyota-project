package cars;

import characteristics.MachineCharacteristics;
import characteristics.Transmission;
import components.*;

public abstract class PassengerCar extends Car  {

    public boolean haveCruiseControl;

    public PassengerCar(Wheels[] wheels, GasTank gasTank, Headlights headlights, Electrician electrician, Engine engine, boolean haveCruiseControl) {
        super(wheels, gasTank, headlights, electrician, engine);
        this.haveCruiseControl = haveCruiseControl;
    }

    public void setHaveCruiseControl(boolean haveCruiseControl) {
        this.haveCruiseControl = haveCruiseControl;
    }
}
