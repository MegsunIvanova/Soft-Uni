package PB_Exams_training;

import java.util.Scanner;

public class aluminumJoinery_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String receiptMethod = scanner.nextLine();
        double price = 0;

        if (number < 10) {
            System.out.println("Invalid order");
        } else {
            switch (type) {
                case "90X130":
                    price = 110 * number;
                    if (number > 60) {
                        price *= 0.92;
                    } else if (number > 30) {
                        price *= 0.95;
                    }
                    break;
                case "100X150":
                    price = 140 * number;
                    if (number > 80) {
                        price *= 0.90;
                    } else if (number > 40) {
                        price *= 0.94;
                    }
                    break;
                case "130X180":
                    price = 190 * number;
                    if (number > 50) {
                        price *= 0.88;
                    } else if (number > 20) {
                        price *= 0.93;
                    }
                    break;
                case "200X300":
                    price = 250 * number;
                    if (number > 50) {
                        price *= 0.86;
                    } else if (number > 25) {
                        price *= 0.91;
                    }
                    break;
            }
            if (receiptMethod.equals("With delivery")) {
                price += 60;
            }
            if (number > 99) {
                price *= 0.96;
            }

            System.out.printf("%.2f BGN", price);
        }
    }
}
