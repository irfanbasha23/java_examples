package designpatterns.creational;

public class Singleton {

    private Singleton() {

    }

    private static final Singleton singleton = new Singleton();

    // Early Initialization
    // Threre are other ways, Lazy Initialization, Thread safe, Double lock checking, Static Inner class, Enum, Concurrency
    public static Singleton getInstance() {
        return singleton;
    }
}
