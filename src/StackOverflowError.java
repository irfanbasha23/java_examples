public class StackOverflowError {

    public static void main(String[] args) {
        recurringMethod();
    }

    private static void recurringMethod() {
        recurringMethod();
    }
}
