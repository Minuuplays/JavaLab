package thread;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class utildemo3 { // current task manager
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        try {
            List<Callable<String>> tasks = List.of(
                    () -> "Square of 12 = " + (12 * 12),
                    () -> "Cube of 5 = " + (5 * 5 * 5),
                    () -> "Sum 1..50 = " + (50 * 51 / 2)
            );

            List<Future<String>> futures = executor.invokeAll(tasks);
            for (Future<String> future : futures) {
                System.out.println(future.get());
            }
        } finally {
            executor.shutdown();
        }
    }
}