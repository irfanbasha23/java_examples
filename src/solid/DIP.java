package solid;

interface Switchable {
    void turnOn();
    void turnOff();
}

class LightBulb1 implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("LightBulb is on");
    }

    @Override
    public void turnOff() {
        System.out.println("LightBulb is off");
    }
}

class Switch1 {
    private Switchable device;

    public Switch1(Switchable device) {
        this.device = device;
    }

    public void operate() {
        device.turnOn();
        device.turnOff();
    }
}

public class DIP {
}
