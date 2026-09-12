package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class utildemo2 { // callable future
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        try {
            Callable<Integer> sumTask = () -> {
                int sum = 0;
                for (int i = 1; i <= 100; i++) sum += i;
                return sum;
            };

            Future<Integer> future = executor.submit(sumTask);
            System.out.println("Main can do other work.");
            System.out.println("Sum = " + future.get()); // waits if needed
        } finally {
            executor.shutdown();
        }
    }
}