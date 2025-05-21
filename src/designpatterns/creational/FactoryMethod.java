package designpatterns.creational;

abstract class Vehicle {
    public abstract void printNoOfWheels();
}

class Bike extends Vehicle {
    public void printNoOfWheels() {
        System.out.println("Bike has 2 wheels");
    }
}

public class FactoryMethod {

    public static Vehicle createVehicle(String type) {
        if("Bike".equalsIgnoreCase(type)) {
            return new Bike();
        }
        return null;
    }
}
