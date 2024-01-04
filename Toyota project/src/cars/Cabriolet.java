package cars;

import characteristics.MachineCharacteristics;
import characteristics.Transmission;
import components.*;

public abstract class Cabriolet extends PassengerCar {

    public boolean roofCondition;

    public Cabriolet(Wheels[] wheels, GasTank gasTank, Headlights headlights, Electrician electrician, Engine engine, boolean haveCruiseControl, boolean roofCondition) {
        super(wheels, gasTank, headlights, electrician, engine, haveCruiseControl);
        this.roofCondition = roofCondition;
    }

    public boolean isRoofCondition() {
        return roofCondition;
    }

    public void setRoofCondition(boolean roofCondition) {
        this.roofCondition = roofCondition;
    }
}
