package cars;


import components.Electrician;
import components.Engine;
import components.GasTank;
import components.Wheels;

public class StartCarException extends Exception {

    public StartCarException(String message) {
        super(message);
    }
}
