package l01xt;

@FunctionalInterface
interface Notifier {
    void send(String message);
}

@FunctionalInterface
interface ScoreRule {
    boolean test(int score);
}

public class FunctionalDemo {
    public static void main(String[] args) {
        Notifier notifier = new Notifier() {
            @Override
            public void send(String message) {
                System.out.println("[NOTICE] " + message);
            }
        };
        notifier.send("Lab example started");
        ScoreRule passed = score -> (score >= 50);
        System.out.println("72 passed: " + passed.test(72));
    }
}