package concurrencyandthreads;

public class RunnableExample implements Runnable {

    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableExample());
        t1.start();
    }
}
