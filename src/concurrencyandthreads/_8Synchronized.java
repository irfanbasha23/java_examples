package concurrencyandthreads;

public class _8Synchronized {

    private Object obj;

    public synchronized void setObject(Object o) {
        this.obj = o;
    }

    public synchronized Object getObject() {
        return this.obj;
    }

    public void setObj(Object o) {
        synchronized (this) {
            this.obj = o;
        }
    }

    public Object getObj() {
        synchronized (this) {
            return this.obj;
        }
    }
}
