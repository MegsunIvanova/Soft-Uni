package tema3.ConditionalStatementsAdvanced_MoreExercises;

import java.util.Scanner;

public class matchTickets_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());

        double price = 0;
        double transport = 0;

        switch (category) {
            case "VIP":
                price = 499.99 * number;
                break;
            case "Normal":
                price = 249.99 * number;
                break;
        }

        if (number >= 1 && number < 4) {
            transport = budget * 0.75;
        } else if (number >= 5 && number <= 9) {
            transport = budget * 0.60;
        } else if (number >= 10 && number <= 24) {
            transport = budget * 0.50;
        } else if (number >= 25 && number <= 49) {
            transport = budget * 0.40;
        } else if (number >= 50) {
            transport = budget * 0.25;
        }

        if (budget - transport - price >= 0) {
            System.out.printf("Yes! You have %.2f leva left.", (budget - transport - price));
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", price + transport - budget);
        }
    }
}
