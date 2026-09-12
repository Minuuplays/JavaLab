package l01;

public class demo3 { // string demo
    public static void main(String[] args) {
        String first = new String("Java");
        String second = new String("Java");
        System.out.println(first == second);
        System.out.println(first.equals(second));
        System.out.println(first.toUpperCase());
        System.out.println(" lab ".trim());
        System.out.println("Student-%03d".formatted(7));
    }
}
