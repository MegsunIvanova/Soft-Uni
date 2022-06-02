package PB_Exams_training;

import java.util.Scanner;

public class agencyProfit_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String airline = scanner.nextLine();
        ;
        int adultsTickets = Integer.parseInt(scanner.nextLine());
        int kidsTickets = Integer.parseInt(scanner.nextLine());
        double priceAdult = Double.parseDouble(scanner.nextLine());
        double serviceFee = Double.parseDouble(scanner.nextLine());
        double priceKid = priceAdult * 0.30;
        double totalSum = adultsTickets * priceAdult + kidsTickets * priceKid + serviceFee * (adultsTickets + kidsTickets);
        double profit = totalSum * 0.20;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", airline, profit);


    }
}
