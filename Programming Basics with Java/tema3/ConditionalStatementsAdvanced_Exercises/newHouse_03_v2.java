package tema3.ConditionalStatementsAdvanced_Exercises;

import java.util.Scanner;

public class newHouse_03_v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowers = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double priceRoses = 5.00;
        double priceDahlias = 3.80;
        double priceTulips = 2.80;
        double priceNarcissus = 3.00;
        double priceGladiolus = 2.50;

        double price = 0;

        switch (flowers) {

            case "Roses":
                price = quantity * priceRoses;
                if (quantity > 80) {
                    price = price - (price * 0.10);
                }
                break;
            case "Dahlias":
                price = quantity * priceDahlias;
                if (quantity > 90) {
                    price = price - (price * 0.15);
                }
                break;
            case "Tulips":
                price = quantity * priceTulips;
                if (quantity > 80) {
                    price = price - (price * 0.15);
                }
                break;
            case "Narcissus":
                price = quantity * priceNarcissus;
                if (quantity < 120) {
                    price = price + (price * 0.15);
                }
                break;
            case "Gladiolus":
                price = quantity * priceGladiolus;
                if (quantity < 80) {
                    price = price + (price * 0.20);
                }
                break;
        }

        if (price <= budget) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", quantity, flowers, budget - price);
        } else if (price > budget) {
            System.out.printf("Not enough money, you need %.2f leva more.", price - budget);
        }

    }
}
