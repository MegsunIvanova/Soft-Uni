package tema2.ConditionalStatements_Exercises;

import java.util.Scanner;

public class GodzillaVsKong_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int extras = Integer.parseInt(scanner.nextLine());
        double pricePerClothing = Double.parseDouble(scanner.nextLine());

        double decorPrice = budget * 0.1;
        double clothingPrice = extras * pricePerClothing;
        if (extras > 150) {
            clothingPrice = clothingPrice * 0.9;
        }

        double result = budget - decorPrice - clothingPrice;

        if (result < 0) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", Math.abs(result * 10) / 10);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", result);
        }


    }
}
