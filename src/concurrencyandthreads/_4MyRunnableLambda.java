package concurrencyandthreads;

public class _4MyRunnableLambda {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println(Thread.currentThread().getName()+": running");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+": finished");
        };
        Thread thread = new Thread(runnable, "New Thread 1");
        Thread thread2 = new Thread(runnable, "New Thread 2");
        thread2.start();
        thread.start();
    }
}
