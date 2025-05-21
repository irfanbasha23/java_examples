package concurrencyandthreads;

public class _7SharedObjects {

    public static void main(String[] args) {
        _3MyRunnable runnable =  new _3MyRunnable();
        Thread thread1 = new Thread(runnable, "Thread1"); // both threads share the same class/instance level variables
        Thread thread2 = new Thread(runnable, "Thread2");

        thread1.start();
        thread2.start();
    }
}
