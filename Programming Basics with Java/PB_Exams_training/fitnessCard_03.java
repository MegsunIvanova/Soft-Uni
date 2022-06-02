package PB_Exams_training;

import java.util.Scanner;

public class fitnessCard_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = Double.parseDouble(scanner.nextLine());
        char gender = scanner.nextLine().charAt(0);
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();

        double price = 0;
        double malePrices = 0;
        double femalePrices = 0;

        switch (sport) {
            case "Gym":
                malePrices = 42;
                femalePrices = 35;
                break;
            case "Boxing":
                malePrices = 41;
                femalePrices = 37;
                break;
            case "Yoga":
                malePrices = 45;
                femalePrices = 42;
                break;
            case "Zumba":
                malePrices = 34;
                femalePrices = 31;
                break;
            case "Dances":
                malePrices = 51;
                femalePrices = 53;
                break;
            case "Pilates":
                malePrices = 39;
                femalePrices = 37;
                break;
        }

        if (gender == 'm') {
            price = malePrices;
        } else if (gender == 'f') {
            price = femalePrices;
        }

        if (age <= 19) {
            price *= 0.80;
        }

        if (sum >= price) {
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        } else {
            System.out.printf("You don't have enough money! You need $%.2f more.", price - sum);
        }
    }
}
