package concurrencyandthreads;

import java.util.concurrent.*;

public class FutureWithCallableExample {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Callable<String> task = () -> {
            TimeUnit.SECONDS.sleep(1);
            return "Running the thread "+Thread.currentThread().getName();
        };
        Future<String> resultFuture = executorService.submit(task);
        try {
            String s = resultFuture.get();
            System.out.println("Result: " + s);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
