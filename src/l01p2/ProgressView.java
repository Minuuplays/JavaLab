package l01p2;

public interface ProgressView {
    String summary();

    default void printSummary() {
        System.out.println(summary());
    }
}