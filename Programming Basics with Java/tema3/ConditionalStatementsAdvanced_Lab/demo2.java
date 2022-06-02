package tema3.ConditionalStatementsAdvanced_Lab;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();

        // това е подобрен switch case
        switch (day) {
            case "Monday" -> System.out.println("On Monday you get 10% discount!");
            case "Tuesday", "Wednesday" -> System.out.printf("On %s you get 25%% discount!", day);
            default -> System.out.println("No discount!");
        }

        //това не може да се реализира със switch case,
        // защото switch case сравнява само директни стойности:

        int money = Integer.parseInt(scanner.nextLine());
        if (money > 100) {
            System.out.println("You buy a jacket!");
        }

        // това може да се реализира и със switch case
        if (day.equals("Monday")) {
            System.out.println("On Monday you get 10% discount!");
        } else if (day.equals("Tuesday")) {
            System.out.println("On Tuesday you get 20% discount!");
        } else if (day.equals("Wednesday")) {
            System.out.println("On Wednesday you get 30% discount!");
        } else {
            System.out.println("No discount!");
        }
    }
}
