package concurrencyandthreads;

public class _5StoppableRunnable implements Runnable {
    private boolean isStopRequested = false;

    public synchronized void setStopRequested() {
        this.isStopRequested = true;
    }

    public synchronized boolean isStopRequested() {
        return this.isStopRequested;
    }

    public void sleep(long milliSeconds) {
        try {
            Thread.sleep(milliSeconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void run() {
        System.out.println("_5StoppableRunnable is running");
        while(!isStopRequested) {
            sleep(1000);
            System.out.println("...");
        }
        System.out.println("_5StoppableRunnable is stopped");
    }

    public static void main(String[] args) {
        _5StoppableRunnable stoppableRunnable = new _5StoppableRunnable();
        Thread thread = new Thread(stoppableRunnable);
        thread.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Requesting to stop");
        stoppableRunnable.setStopRequested();
        System.out.println("Stopped");
    }
}
