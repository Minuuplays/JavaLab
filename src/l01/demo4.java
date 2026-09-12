package l01;

import java.util.Scanner;

public class demo4 { // ControlFlow demo
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Score :");
        int score = scanner.nextInt();
        if (score >= 80) {
            System.out.println("Strong progress");
        } else if (score >= 50) {
            System.out.println("On track");
        } else {
            System.out.println("Needs support");
        }
        String menuChoice = "2";
        switch (menuChoice) {
            case "1" -> System.out.println("Show students"); // case “1”: System.out.println("Show students");break; //also works
            case "2" -> System.out.println("Add score");
            default -> System.out.println("Unknown option");
        }
        for (int week = 1; week <= 4; week++) {
            System.out.println("Week " + week);
        }
        String[] tools = {"Git", "Docker", "Maven"};
        for (String tool : tools) {
            System.out.println(tool);
        }
        int attempts = 0;
        while (attempts < 2) {
            System.out.println("Practice attempt " + (attempts + 1));
            attempts++;
        }
    }
}
