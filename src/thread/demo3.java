package thread;

public class demo3 { // implementing runnable interface
    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println(Thread.currentThread().getName()
                        + " processed item " + i);
            }
        };

        Thread worker = new Thread(task, "inventory-worker");
        worker.start();
        worker.join();
        System.out.println("Main finished.");
    }
}