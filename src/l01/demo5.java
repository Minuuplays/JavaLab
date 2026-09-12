package l01;

public class demo5 { // method scope demo
    public static void main(String[] args) {
        System.out.println(progress(3, 4));
        System.out.println(progress(3, 4, 5));
    }
    static double progress(int completed, int total) {
        return (double) completed / total * 100;
    }
    static double progress(int completed, int total, int bonusPercent) {
        return Math.min(progress(completed, total) + bonusPercent, 100);
    }
}
