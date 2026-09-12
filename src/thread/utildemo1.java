package thread;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class utildemo1 { // fixed thread
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        for (int i = 1; i <= 5; i++) {
            int taskId = i; // effectively final copy for the lambda
            executor.execute(() -> {
                System.out.println("Task " + taskId + " executed by "
                        + Thread.currentThread().getName());
            });
        }

        executor.shutdown();
    }
}
