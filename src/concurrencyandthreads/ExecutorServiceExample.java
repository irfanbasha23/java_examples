package concurrencyandthreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for(int i = 0; i < 10; i++) {
            executorService.submit(() ->  {
                {
                    System.out.println("Thread is running "+Thread.currentThread().getName());
                }
            });
        }
        executorService.shutdown();
    }
}
