package tema3.ConditionalStatementsAdvanced_Exercises;

import java.util.Scanner;

public class fishingBoat_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (season) {
            case "Spring":
                price = 3000;
                break;
            case "Summer":
            case "Autumn":
                price = 4200;
                break;
            case "Winter":
                price = 2600;
                break;
        }
        if (number >= 12) {
            price = price * 0.75;
        } else if (number >= 7) {
            price = price * 0.85;
        } else {
            price = price * 0.90;
        }

        if (number % 2 == 0 && !season.equals("Autumn")) {
            price = price * 0.95;
        }

        if (budget >= price) {
            System.out.printf("Yes! You have %.2f leva left.", budget - price);
        } else if (budget < price) {
            System.out.printf("Not enough money! You need %.2f leva.", price - budget);
        }
    }
}

