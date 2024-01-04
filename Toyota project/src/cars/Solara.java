package cars;

import characteristics.MachineCharacteristics;
import characteristics.Transmission;
import components.*;

public class Solara extends Cabriolet {
    private static final boolean MINI_REFRIGERATOR = true;

    public Solara(Wheels[] wheels, GasTank gasTank, Headlights headlights, Electrician electrician, Engine engine, boolean haveCruiseControl, boolean roofCondition) {
        super(wheels, gasTank, headlights, electrician, engine, haveCruiseControl, roofCondition);
    }

    public void CoolTheDrink() {
        System.out.println("Охлаждаю напиток");
    }
}
