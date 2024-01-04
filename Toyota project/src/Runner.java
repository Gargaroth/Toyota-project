import cars.*;
import components.*;

public class Runner {
    public static void main(String[] args) {
        Wheels[] camryWheels = new Wheels[]{new Wheels(false,17), new Wheels(false,17), new Wheels(false,17), new Wheels(false,17)};
        Wheels[] solaraWheels = new Wheels[]{new Wheels(false,16), new Wheels(false,16), new Wheels(false,16), new Wheels(false,16)};
        Wheels[] hianceWheels = new Wheels[]{new Wheels(false,20), new Wheels(false,20), new Wheels(false,20), new Wheels(false,20)};
        Wheels[] dynaWheels = new Wheels[]{new Wheels(false,20), new Wheels(false,20), new Wheels(false,20), new Wheels(false,20)};

        GasTank gasTank = new GasTank(10);
        Engine engine = new Engine(true);
        Electrician electrician = new Electrician(true);
        Headlights headlights = new Headlights(true);

        Car camry = new Camry(camryWheels, gasTank, headlights, electrician, engine, true);
        Car solara = new Solara(solaraWheels, gasTank, headlights, electrician, engine, true, true);
        Car hiance = new Hiance(hianceWheels, gasTank, headlights, electrician, engine, 10);
        Car dyna = new Dyna(dynaWheels, gasTank, headlights, electrician, engine, 20);

        Car[] cars = new Car[]{camry, solara, hiance, dyna};
        for (Car car : cars) {
            try {
                car.Start();
            } catch (StartCarException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(car.isStateOfMotion());

        }
        camry.Stop();
        System.out.println(camry.isStateOfMotion());

    }
}