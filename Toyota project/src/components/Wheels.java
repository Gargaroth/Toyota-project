package components;

public class Wheels {
    public boolean Pierced;
    public int Diameter;

    public Wheels(boolean pierced, int diameter) {
        Pierced = pierced;
        Diameter = diameter;
    }

    public boolean isPierced() {
        return Pierced;
    }

    public void setPierced(boolean pierced) {
        Pierced = pierced;
    }

    public int getDiameter() {
        return Diameter;
    }

    public void setDiameter(int diameter) {
        Diameter = diameter;
    }
}
