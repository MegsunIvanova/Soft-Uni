package PB_Exams_training;

import java.util.Scanner;

public class easterShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        boolean isBigger = false;
        int soldEggs = 0;

        while (!input.equals("Close")) {
            int currentNumber = Integer.parseInt(scanner.nextLine());

            if (input.equals("Fill")) {
                number += currentNumber;
            } else if (currentNumber <= number && input.equals("Buy")) {
                number -= currentNumber;
                soldEggs += currentNumber;
            } else if (currentNumber > number && input.equals("Buy")) {
                isBigger = true;
                break;
            }

            input = scanner.nextLine();
        }

        if (isBigger) {
            System.out.println("Not enough eggs in store!");
            System.out.printf("You can buy only %d.", number);
        } else {
            System.out.println("Store is closed!");
            System.out.printf("%d eggs sold.", soldEggs);
        }
    }
}
