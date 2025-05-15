package solid;

public class LSP {
}

class Bird1 {
}

class FlyingBird extends Bird {
    public void fly() {
        System.out.println("Flying...");
    }
}

class Sparrow1 extends FlyingBird {
}

class Ostrich1 extends Bird1 {
}