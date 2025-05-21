package designpatterns.creational;

abstract class Animal {
    public abstract void makeNoise();
}

class Dog extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Bark");
    }
}

interface AnimalCreation {
    public Animal createAnimal(String type);
}

public class AbstractFactoryExample implements AnimalCreation{
    @Override
    public Animal createAnimal(String type) {
        if("Dog".equalsIgnoreCase(type)) {
            return new Dog();
        }
        return null;
    }
}
