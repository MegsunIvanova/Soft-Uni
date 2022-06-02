package PB_Exams_training;

import java.util.Scanner;

public class movieDestination_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        double totalExpenses = 0;

        if (season.equals("Winter")) {
            switch (destination) {
                case "Dubai":
                    totalExpenses = days * 45000 * 0.70;
                    break;
                case "Sofia":
                    totalExpenses = days * 17000 * 1.25;
                    break;
                case "London":
                    totalExpenses = days * 24000;
                    break;
            }
        } else if (season.equals("Summer")) {
            switch (destination) {
                case "Dubai":
                    totalExpenses = days * 40000 * 0.70;
                    break;
                case "Sofia":
                    totalExpenses = days * 12500 * 1.25;
                    break;
                case "London":
                    totalExpenses = days * 20250;
                    break;
            }
        }

        if (budget >= totalExpenses) {
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", budget - totalExpenses);
        } else {
            System.out.printf("The director needs %.2f leva more!", totalExpenses - budget);
        }

    }
}
