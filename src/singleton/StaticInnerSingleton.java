package singleton;

public class StaticInnerSingleton {

    private StaticInnerSingleton() {

    }

    private static class StaticInnerSingletonHelper {
        private static StaticInnerSingleton instance = new StaticInnerSingleton();
    }

    public static StaticInnerSingleton getInstance() {
        return StaticInnerSingletonHelper.instance;
    }
}
