package concurrencyandthreads;

public class _2MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("_2MyRunnable is started");
        System.out.println("_2MyRunnable is finished");
    }

    public static void main(String[] args) {
        _2MyThread thread = new _2MyThread();
        thread.start();
    }
}
