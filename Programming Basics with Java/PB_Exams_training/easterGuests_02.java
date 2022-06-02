package PB_Exams_training;

import java.util.Scanner;

public class easterGuests_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guests = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        int numberEsterBread = (int) Math.ceil(guests / 3.0);
        int numberOfEggs = guests * 2;
        double totalSum = numberEsterBread * 4 + numberOfEggs * 0.45;

        if (totalSum <= budget) {
            System.out.printf("Lyubo bought %d Easter bread and %d eggs.\n", numberEsterBread, numberOfEggs);
            System.out.printf("He has %.2f lv. left.", (budget - totalSum));
        } else {
            System.out.println("Lyubo doesn't have enough money.");
            System.out.printf("He needs %.2f lv. more.", (totalSum - budget));
        }
    }
}
