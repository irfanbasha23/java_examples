package solid;

interface Workable {
    void work();
}
interface Eatable {
    void eat();
}
class HumanWorker1 implements Workable,Eatable {

    @Override
    public void eat() {

    }

    @Override
    public void work() {

    }
}
class RobotWorker1 implements  Workable {

    @Override
    public void work() {

    }
}
public class ISP {
}
