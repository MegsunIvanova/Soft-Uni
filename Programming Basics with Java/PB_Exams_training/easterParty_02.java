package PB_Exams_training;

import java.util.Scanner;

public class easterParty_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guests = Integer.parseInt(scanner.nextLine());
        double pricePerPerson = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double cake = budget * 0.10;
        double guestsSum = guests * pricePerPerson;
        if (guests > 20) {
            guestsSum *= 0.75;
        } else if (guests > 15) {
            guestsSum *= 0.80;
        } else if (guests >= 10) {
            guestsSum *= 0.85;
        }

        if (cake + guestsSum <= budget) {
            System.out.printf("It is party time! %.2f leva left.", (budget - cake - guestsSum));
        } else {
            System.out.printf("No party! %.2f leva needed.", (cake + guestsSum - budget));
        }

    }
}
