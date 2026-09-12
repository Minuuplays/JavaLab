package thread;

class Box {
    private int item;
    private boolean hasItem;

    synchronized void put(int value) throws InterruptedException {
        while (hasItem) {
            wait();
        }
        item = value;
        hasItem = true;
        System.out.println("Produced: " + value);
        notifyAll();
    }

    synchronized int take() throws InterruptedException {
        while (!hasItem) {
            wait();
        }
        int value = item;
        hasItem = false;
        System.out.println("Consumed: " + value);
        notifyAll();
        return value;
    }
}

public class producerConsumer {
    public static void main(String[] args) throws InterruptedException {
        Box box = new Box();

        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) box.put(i);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, "producer");

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) box.take();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, "consumer");

        producer.start();
        consumer.start();
        producer.join();
        consumer.join();
    }
}
