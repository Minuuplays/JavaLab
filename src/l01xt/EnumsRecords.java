package l01xt;

enum Status {
    ACTIVE, AT_RISK, COMPLETED
}
record LabActivity(String title, int maxPoints) {
    LabActivity {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title cannot be blank.");
        }
        if (maxPoints <= 0) {
            throw new IllegalArgumentException("maxPoints must be positive.");
        }
    }
}
public class EnumsRecords {
    public static void main(String[] args) {
        LabActivity activity = new LabActivity("Syntax Checkpoint", 20);
        Status status = Status.ACTIVE;
        System.out.println(activity);
        System.out.println(status);
    }
}