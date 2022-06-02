package tema5.WhileLoop_MoreExercises;

import java.util.Scanner;

public class reportSystem_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount = Double.parseDouble(scanner.nextLine());
        int price = 0;
        int counter = 0;
        int cashPayments = 0;
        int countCashPayment = 0;
        int cartPayments = 0;
        int countCartPayment = 0;

        while (amount > 0) {
            String input = scanner.nextLine();
            if (input.equals("End")) {
                break;
            }
            counter++;
            price = Integer.parseInt(input);

            if ((counter % 2) != 0 && price <= 100) {
                System.out.println("Product sold!");
                cashPayments+=price;
                countCashPayment++;
                amount -= price;
            } else if ((counter % 2) == 0 && price >= 10) {
                System.out.println("Product sold!");
                cartPayments+=price;
                countCartPayment++;
                amount -= price;
            } else {
                System.out.println("Error in transaction!");
            }

        }

        if (amount <= 0) {
            System.out.printf("Average CS: %.2f%n", ((cashPayments * 1.00) / countCashPayment));
            System.out.printf("Average CC: %.2f%n", ((cartPayments * 1.00) / countCartPayment));

        } else {
            System.out.println("Failed to collect required money for charity.");
        }

    }
}
