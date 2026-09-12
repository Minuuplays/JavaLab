package thread;

public class demo4 { // non-deterministic
    public static void main(String[] args) throws InterruptedException {
        Thread even = new Thread(() -> {
            for (int i = 2; i <= 10; i += 2) {
                System.out.println("EVEN: " + i);
            }
        }, "even-thread");

        Thread odd = new Thread(() -> {
            for (int i = 1; i <= 9; i += 2) {
                System.out.println("ODD: " + i);
            }
        }, "odd-thread");

        even.start();
        odd.start();
        even.join();
        odd.join();
    }
}
