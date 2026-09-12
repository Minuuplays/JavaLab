package thread;

public class demo1 {
    public static void main(String[] args) {
        Thread current = Thread.currentThread();
        System.out.println("Name: " + current.getName());
        System.out.println("State: " + current.getState());
    }
}
