package tema2.ConditionalStatements_Exercises;

import java.util.Scanner;

public class ToyShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vacationPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int teddyBears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        int totalToys = puzzles + dolls + teddyBears + minions + trucks;
        double totalIncome = (puzzles * 2.6 + dolls * 3 + teddyBears * 4.1 + minions * 8.2 + trucks * 2);
        double discount = 0;
        if (totalToys >= 50) {
            discount = totalIncome * 0.25;
        }
        double rent = (totalIncome - discount) * 0.1;

        double result = totalIncome - discount - rent - vacationPrice;

        if (result >=0) {
            System.out.printf ("Yes! %.2f lv left.", result);
        } else {
            System.out.printf ("Not enough money! %.2f lv needed.", Math.abs(result));
        }

    }
}
