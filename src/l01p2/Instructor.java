package l01p2;

public class Instructor extends Person implements ProgressView {
    public Instructor(String id, String name) {
        super(id, name);
    }

    @Override
    public String getRole() {
        return "Instructor";
    }

    @Override
    public String summary() {
        return "%s %s".formatted(getId(), getName());
    }
}