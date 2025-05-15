class SynchronizedMethodClass {
    private static int count = 0;

    public synchronized void increment() {
        count++;
    }
    public synchronized int getCount() {
        return count;
    }
}
