package concurrencyandthreads;

public class _10ThreadLocal {

    public static void main(String[] args) {
        ThreadLocal<String> threadLocal = ThreadLocal.withInitial(() -> "Hello");
        Thread thread1 = new Thread(() -> {
            threadLocal.set("Thread 1");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //threadLocal.remove();
            System.out.println(threadLocal.get());
        });



        Thread thread2 = new Thread(() -> {
            threadLocal.set("Thread 2");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //threadLocal.remove();
            System.out.println(threadLocal.get());
        });

        thread1.start();
        thread2.start();
    }
}
