package thread;


class UnsafeCounter {
    int count = 0;                 // shared mutable field

    void increment() {
        count++;                     // unsafe critical section
    }
}

public class raceCondition {
    public static void main(String[] args) throws InterruptedException {
        UnsafeCounter counter = new UnsafeCounter();

        Runnable task = () -> {
            for (int i = 0; i < 100_000; i++) {
                counter.increment();
            }
        };

        Thread t1 = new Thread(task, "counter-1");
        Thread t2 = new Thread(task, "counter-2");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Expected: 200000");
        System.out.println("Actual:   " + counter.count);
    }
}
