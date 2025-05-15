package concurrencyandthreads;

public class _6DemonThread {

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            System.out.println("started");
            while(true) {
                sleep(1000);
                System.out.println("running");
            }
        };
        Thread t1 = new Thread(runnable);
        t1.setDaemon(true); // You can wait for the Deamon thread to complete by join() with main thread
        t1.start();
        t1.join();
        //sleep(3100);
        }
    public static void sleep(long milli){
        try {
            Thread.sleep(milli);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    }
