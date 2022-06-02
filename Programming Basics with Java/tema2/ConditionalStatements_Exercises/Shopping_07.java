package tema2.ConditionalStatements_Exercises;

import java.util.Scanner;

public class Shopping_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());

        double videoCards = n * 250;
        double processors = m * (videoCards * 0.35);
        double ram = p * (videoCards * 0.10);
        double bill = videoCards + processors + ram;

        if (n > m) {
            bill = bill * 0.85;
        }

        if (budget >= bill) {
            System.out.printf("You have %.2f leva left!", budget - bill);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", bill - budget);
        }


    }
}
