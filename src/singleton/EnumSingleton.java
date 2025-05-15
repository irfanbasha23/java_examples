package singleton;

enum Singleton {
    INSTANCE;
}

class MyRunnable implements Runnable {
    public void run() {
        Singleton singleton = Singleton.INSTANCE;
        System.out.println(singleton.hashCode());
    }
}

public class EnumSingleton {


    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        Thread t2 = new Thread(new MyRunnable());
        Thread t3 = new Thread(new MyRunnable());
        Thread t4 = new Thread(new MyRunnable());
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
