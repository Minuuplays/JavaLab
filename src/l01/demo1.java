package l01;

import java.util.Scanner;

public class demo1 { // variable demo
    public static void main(String[] args) {
        String studentName = "Amina";
        Scanner scanner = new Scanner(System.in);
        int completedLabs = scanner.nextInt();
        double averageScore = 72.5;
        boolean active = true;
        char section = 'A';
        System.out.println("Student: " + studentName);
        System.out.println("Completed labs: " + completedLabs);
        System.out.println("Average: " + averageScore);
        System.out.println("Active: " + active);
        System.out.println("Section: " + section);
    }
}
