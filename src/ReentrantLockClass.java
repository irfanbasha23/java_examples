import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockClass {
    private int count = 0;
    private final ReentrantLock lock = new ReentrantLock(true);

    public void increment() {
        lock.lock();
        try {
            count++;
        }finally {
            lock.unlock();
        }
    }

    public int getCount() {
        lock.lock();
        try {
            return count;
        }finally {
            lock.unlock();
        }
    }
}
