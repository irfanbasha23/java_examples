package concurrencyandthreads;

public class _3MyRunnable implements Runnable{
    private int count = 0;
    @Override
    public void run() {
        System.out.println("_3MyRunnable is started");
        int j = 0; // All primitive types are stored in thread stack
        String value = "temp"; // references are stored in thread stack
        for(int i = 0; i < 100; i++) {
            this.count++;
        }
        Object o = new Object();
        System.out.println(o.toString());
        System.out.println("_3MyRunnable is finished");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new _3MyRunnable());
        thread.start();
    }
}
