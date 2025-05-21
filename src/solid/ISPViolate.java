package solid;

interface Worker {
    void work();
    void eat();
}

class HumanWorker implements  Worker {

    @Override
    public void work() {
        System.out.println("Work");
    }

    @Override
    public void eat() {
        System.out.println("Eat");
    }
}

class RobotWorker implements  Worker {

    @Override
    public void work() {
        System.out.println("Work");
    }

    @Override
    public void eat() {
        // Cant eat
    }
}
public class ISPViolate {

}
