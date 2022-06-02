package tema3.ConditionalStatementsAdvanced_Exercises;

import java.util.Scanner;

public class journey_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String vacationType = "";
        double amountSpent = 0;

        if (budget > 1000) {
            destination = "Europe";
            vacationType = "Hotel";
            amountSpent = budget * 0.9;
        } else if (budget > 100) {
            destination = "Balkans";
        } else {
            destination = "Bulgaria";
        }

        if (season.equals("summer")) {
            switch (destination) {
                case "Bulgaria":
                    vacationType = "Camp";
                    amountSpent = budget * 0.30;
                    break;
                case "Balkans":
                    vacationType = "Camp";
                    amountSpent = budget * 0.40;
                    break;
            }
        } else if (season.equals("winter")) {
            switch (destination) {
                case "Bulgaria":
                    vacationType = "Hotel";
                    amountSpent = budget * 0.70;
                    break;
                case "Balkans":
                    vacationType = "Hotel";
                    amountSpent = budget * 0.80;
                    break;
            }
        }

        System.out.println("Somewhere in " + destination);
        System.out.printf("%s - %.2f", vacationType, amountSpent);

    }
}
