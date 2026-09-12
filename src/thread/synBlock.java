package thread;

class BankAccount {
    private final Object lock = new Object();
    private int balance = 1_000;

    boolean withdraw(int amount) {
        synchronized (lock) {
            if (amount > 0 && balance >= amount) {
                balance -= amount;
                return true;
            }
            return false;
        }
    }
}
