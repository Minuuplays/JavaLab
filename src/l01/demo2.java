package l01;

import java.util.Scanner;

public class demo2 { // operator demo
    static void main(String[] args) {
        int rawScore ;
        Scanner scanner = new Scanner(System.in);
        rawScore = scanner.nextInt();
        int bonus = 5;
        int adjusted = Math.min(rawScore + bonus, 100);
        boolean attendanceOk = true;
        boolean passed = adjusted >= 50 && attendanceOk;
        int remainder = adjusted % 10;
        String result = passed ? "PASS" : "REVIEW";
        System.out.println("Adjusted: " + adjusted);
        System.out.println("Remainder: " + remainder);
        System.out.println("Result: " + result);
    }
}