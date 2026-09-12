package l01p2;

public class Student extends Person implements ProgressView {
    public Student(String id, String name) {
        super(id, name);
    }

    @Override
    public String getRole() {
        return "Student";
    }

    @Override
    public String summary() {
        return "%s %s".formatted(getId(), getName());
    }
}