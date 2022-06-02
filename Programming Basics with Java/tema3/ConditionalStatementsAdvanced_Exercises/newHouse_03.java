package tema3.ConditionalStatementsAdvanced_Exercises;

import java.util.Scanner;

public class newHouse_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowers = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price = 0;

        if (flowers.equals("Roses")) {
            if (quantity <= 80) {
                price = quantity * 5;
            } else if (quantity > 80) {
                price = quantity * 5 * 0.9;
            }
        } else if (flowers.equals("Dahlias")) {
            if (quantity <= 90) {
                price = quantity * 3.8;
            } else if (quantity > 90) {
                price = quantity * 3.8 * 0.85;
            }
        } else if (flowers.equals("Tulips")) {
            if (quantity <= 80) {
                price = quantity * 2.8;
            } else if (quantity > 80) {
                price = quantity * 2.8 * 0.85;
            }
        } else if (flowers.equals("Narcissus")) {
            if (quantity < 120) {
                price = quantity * 3 * 1.15;
            } else if (quantity >= 120) {
                price = quantity * 3;
            }
        } else if (flowers.equals("Gladiolus")) {
            if (quantity < 80) {
                price = quantity * 2.5 * 1.2;
            } else if (quantity >= 80) {
                price = quantity * 2.5;
            }
        }
        if (price <= budget) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", quantity, flowers, budget - price);
        } else if (price > budget) {
            System.out.printf("Not enough money, you need %.2f leva more.", price - budget);
        }
    }
}
