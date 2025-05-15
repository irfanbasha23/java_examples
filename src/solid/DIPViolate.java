package solid;

class LightBulb {
    public void turnOn() {
        System.out.println("LightBulb is on");
    }

    public void turnOff() {
        System.out.println("LightBulb is off");
    }
}
//The Switch class directly depends on the LightBulb class, violating DIP.
class Switch {
    private LightBulb lightBulb;

    public Switch(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    public void operate() {
        lightBulb.turnOn();
    }
}

public class DIPViolate {
}
