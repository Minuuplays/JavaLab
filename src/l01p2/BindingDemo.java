package l01p2;

import java.util.List;

public class BindingDemo {
    public static void main(String[] args) {
        Person student = new Student("S101", "Amina");
        Person instructor = new Instructor("T01", "Dr. Hasan");
        List<Person> people = List.of(student, instructor);
        for (Person person : people) {
            System.out.println(person.getRole());
        }
        System.out.println("Created: " + Person.getCreatedCount());
    }
}