public class VolatileExample {
    private volatile boolean isRunning = true;

    public void start () {
        new Thread(() -> {
            while(isRunning) {
            // Some tasks
                System.out.println("Thread has been running");
            }
            System.out.println("Thread has been stopped");
        }).start();
    }

    public void stop () {
        isRunning = false;
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileExample ve = new VolatileExample();
        ve.start();
        Thread.sleep(2000);
        ve.stop();
    }
}
