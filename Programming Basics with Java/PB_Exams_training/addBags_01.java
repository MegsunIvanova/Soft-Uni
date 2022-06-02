package PB_Exams_training;

import java.util.Scanner;

public class addBags_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceOver20kg = Double.parseDouble(scanner.nextLine());
        double luggageKg = Double.parseDouble(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int number = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;

        if (luggageKg < 10) {
            totalPrice = priceOver20kg * 0.20;
        } else if (luggageKg <= 20) {
            totalPrice = priceOver20kg * 0.50;
        } else {
            totalPrice = priceOver20kg;
        }

        if (days < 7) {
            totalPrice *= 1.40;
        } else if (days <= 30) {
            totalPrice *= 1.15;
        } else {
            totalPrice *= 1.10;
        }


        System.out.printf("The total price of bags is: %.2f lv.", totalPrice * number);
    }
}
