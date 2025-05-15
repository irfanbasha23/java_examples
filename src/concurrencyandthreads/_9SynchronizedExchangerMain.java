package concurrencyandthreads;

public class _9SynchronizedExchangerMain {

    public static void main(String[] args) {
        _8Synchronized syn = new _8Synchronized();

        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 1000; i++) {
                syn.setObj(""+i);
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 1000; i++) {
                System.out.println(syn.getObj());
            }
        });

        t1.start();
        t2.start();
    }
}
