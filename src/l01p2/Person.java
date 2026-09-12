package l01p2;

public abstract class Person {
    private static int createdCount = 0;
    private final String id;
    private final String name;

    protected Person(String id, String name) {
        this.id = id;
        this.name = name;
        createdCount++;
    }

    public final String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static int getCreatedCount() {
        return createdCount;
    }

    public abstract String getRole();
}