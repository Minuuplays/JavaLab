package thread;

class SafeCounter {
    private int count;

    synchronized void increment() {
        count++;
    }

    synchronized int getCount() {
        return count;
    }
}

public class synchronizedCounter {
    public static void main(String[] args) throws InterruptedException {
        SafeCounter counter = new SafeCounter();
        Runnable task = () -> {
            for (int i = 0; i < 100_000; i++) counter.increment();
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter.getCount());
    }
}