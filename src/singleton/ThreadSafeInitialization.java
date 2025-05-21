package singleton;

public class ThreadSafeInitialization {
    private static ThreadSafeInitialization instance;
    private ThreadSafeInitialization() {

    }
    public synchronized static ThreadSafeInitialization getInstance() {
        if(instance == null) {
            return new ThreadSafeInitialization();
        }
        return instance;
    }
}
