package PB_Exams_training;

import java.util.Scanner;

public class easterDecoration_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfClients = Integer.parseInt(scanner.nextLine());
        double totalAmount = 0;

        for (int i = 1; i <= numberOfClients; i++) {
            String purchase = scanner.nextLine();
            double currentAmount = 0;
            int itemsCounter = 0;

            while (!purchase.equals("Finish")) {
                switch (purchase) {
                    case "basket":
                        currentAmount += 1.50;
                        break;
                    case "wreath":
                        currentAmount += 3.80;
                        break;
                    case "chocolate bunny":
                        currentAmount += 7.00;
                        break;

                }
                itemsCounter++;
                purchase = scanner.nextLine();
            }
            if (itemsCounter % 2 == 0) {
                currentAmount *= 0.80;
            }
            totalAmount += currentAmount;
            System.out.printf("You purchased %d items for %.2f leva.\n", itemsCounter, currentAmount);
        }

        double averageBill = totalAmount / numberOfClients;
        System.out.printf("Average bill per client is: %.2f leva.", averageBill);

    }
}
