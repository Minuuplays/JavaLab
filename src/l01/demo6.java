package l01;

import java.util.ArrayList;
import java.util.LinkedList;

public class demo6 { // array arraylist demo
    public static void main(String[] args) {
        int[] weeklyScores = {78, 84, 0, 0};
        System.out.println("Week 1: " + weeklyScores[0]);
        ArrayList<String> activities = new ArrayList<>();
        activities.add("Syntax Checkpoint");
        activities.add("OOP Checkpoint");
        LinkedList<String> helpQueue = new LinkedList<>();
        helpQueue.addLast("Explain interfaces");
        helpQueue.addLast("Check exception code");
        for (String activity : activities) {
            System.out.println("Done: " + activity);
        }
        while (!helpQueue.isEmpty()) {
            System.out.println("Helping: " + helpQueue.removeFirst());
        }
    }
}