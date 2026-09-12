package l01;

public class demo7 { //class demo
    public static void main(String[] args) {
        StudentBasic student = new StudentBasic("S101", "Amina");
        System.out.println(student.getId());
        System.out.println(student.getName());
        student.setName("Amina Rahman");
        System.out.println(student.getName());
    }
}
