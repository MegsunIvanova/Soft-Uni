package PB_Exams_training;

import java.util.Scanner;

public class familyTrip_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double pricePerNight = Double.parseDouble(scanner.nextLine());
        int percentExpenses = Integer.parseInt(scanner.nextLine());

        double totalPrice = nights * pricePerNight;
        if (nights > 7) {
            totalPrice *= 0.95;
        }
        double additionalExpenses = budget * (percentExpenses / 100.0);

        if (budget >= totalPrice + additionalExpenses) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", budget - additionalExpenses - totalPrice);
        } else {
            System.out.printf("%.2f leva needed.", additionalExpenses + totalPrice - budget);
        }


    }
}
