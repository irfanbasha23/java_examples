package singleton;

import java.util.concurrent.atomic.AtomicReference;

public class AtomicReferenceSingleton {

    private static AtomicReference<AtomicReferenceSingleton> instance = new AtomicReference<>();

    private AtomicReferenceSingleton() {

    }

    public static AtomicReferenceSingleton getInstance() {
        for (;;) {
            AtomicReferenceSingleton current = instance.get();
            if (current != null) {
                return current;
            }
            current = new AtomicReferenceSingleton();
            if (instance.compareAndSet(null, current)) {
                return current;
            }
        }
    }
}
