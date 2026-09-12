package thread;

public class demo5 {
    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Working step " + i);
                    Thread.sleep(400);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // restore the request
                System.out.println("Worker stopped cooperatively.");
            }
        }, "report-worker");

        worker.start();
        Thread.sleep(900);
        worker.interrupt();
        worker.join();
        System.out.println("Main continues after worker termination.");
    }
}
