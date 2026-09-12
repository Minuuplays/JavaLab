package thread;

class NumberThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " -> " + i);
        }
    }
}

public class demo2 { // extending Thread class
    public static void main(String[] args) throws InterruptedException {
        NumberThread worker = new NumberThread();
        worker.setName("number-worker");

        System.out.println("Before start: " + worker.getState());
        worker.start();
        worker.join();
        System.out.println("After finish: " + worker.getState());
    }
}

