package l01;

public class StudentBasic {
    private final String id;
    private String name;
    public StudentBasic(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name != null && !name.isBlank()) {
            this.name = name;
        }
    }
}
