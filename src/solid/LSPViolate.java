package solid;

class Bird {
    public void fly() {
        System.out.println("Bird is flying..");
    }
}

class Sparrow extends Bird {

}
class Ostrich extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostrich can't fly");
    }
}
public class LSPViolate {
}
