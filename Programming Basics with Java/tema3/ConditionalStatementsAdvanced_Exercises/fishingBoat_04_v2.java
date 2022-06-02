package tema3.ConditionalStatementsAdvanced_Exercises;

import java.util.Scanner;

public class fishingBoat_04_v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishmen = Integer.parseInt(scanner.nextLine());

        double priceShip = 0;

        if (season.equals("Spring")) {
            priceShip = 3000;
        } else if (season.equals("Summer") || season.equals("Autumn")) {
            priceShip = 4200;
        } else if (season.equals("Winter")) {
            priceShip = 2600;
        }

        if (fishmen <= 6) {
            priceShip = priceShip - priceShip * 0.10;
        } else if (fishmen <= 11) {
            priceShip = priceShip - priceShip * 0.15;
        } else {
            priceShip = priceShip - priceShip * 0.25;
        }

        if (fishmen % 2 == 0 && !season.equals("Autumn")) {
            priceShip = priceShip - priceShip * 0.05;
        }

        if (budget >= priceShip) {
            System.out.printf("Yes! You have %.2f leva left.", budget - priceShip);
        } else if (budget < priceShip) {
            System.out.printf("Not enough money! You need %.2f leva.", priceShip - budget);
        }
    }
}

