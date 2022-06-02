package tema1.FirstStepsInCoding_PB_MoreExercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Fishland_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mackerelPrice = Double.parseDouble(scanner.nextLine());
        double spratPrice = Double.parseDouble(scanner.nextLine());
        double bonitoKg = Double.parseDouble(scanner.nextLine());
        double horseMackerelKg = Double.parseDouble(scanner.nextLine());
        double musselsKg = Double.parseDouble(scanner.nextLine());

        double bonitoPrice = mackerelPrice * 1.6;
        double horseMackerelPrice = spratPrice * 1.8;

        //•	Миди – 7.50 лв. за килограм
        // Да се отпечата на конзолата едно число с плаваща запетая:
        // колко пари ще са нужни на Георги, за да си плати сметката.
        // Числото трябва да е форматирано до вторият знак след десетичната запетая
        // (1.2457 -> 1.25).

        double totalPrice = bonitoKg * bonitoPrice + horseMackerelKg * horseMackerelPrice + musselsKg * 7.5;

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println(df.format(totalPrice));
    }
}
