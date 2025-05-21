package designpatterns.structural;

abstract class Vehicle {
    Vehicle(Workshop w1, Workshop w2) {
        this.w1 = w1;
        this.w2 = w2;
    }
    Workshop w1;
    Workshop w2;
    abstract void manufacture();
}
class Car extends Vehicle {
    public Car(Workshop w1, Workshop w2) {
        super(w1,w2);
    }
    @Override
    void manufacture() {
     w1.work();
     w2.work();
    }
}
class Bike extends Vehicle {
    public Bike(Workshop w1, Workshop w2) {
        super(w1,w2);
    }
    @Override
    void manufacture() {
        w1.work();
        w2.work();
    }
}
class Assemble implements Workshop {
    @Override
    public void work() {
        System.out.println("Assemble");
    }
}
class Produce implements Workshop {
    @Override
    public void work() {
        System.out.println("Produce");
    }
}
interface Workshop {
    void work();
}
public class BridgePattern {
    public static void main() {
        Vehicle v1 = new Car(new Produce(), new Assemble());
        Vehicle v2 = new Bike(new Produce(), new Assemble());
    }
}
