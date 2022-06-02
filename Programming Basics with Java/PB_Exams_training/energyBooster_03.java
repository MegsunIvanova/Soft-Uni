package PB_Exams_training;

import java.util.Scanner;

public class energyBooster_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String size = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());
        double sum = 0;

        if (size.equals("small")) {
            switch (fruit) {
                case "Watermelon":
                    sum = 2 * 56.00 * number;
                    break;
                case "Mango":
                    sum = 2 * 36.66 * number;
                    break;
                case "Pineapple":
                    sum = 2 * 42.10 * number;
                    break;
                case "Raspberry":
                    sum = 2 * 20.00 * number;
                    break;
            }
        } else if (size.equals("big")) {
            switch (fruit) {
                case "Watermelon":
                    sum = 5 * 28.70 * number;
                    break;
                case "Mango":
                    sum = 5 * 19.60 * number;
                    break;
                case "Pineapple":
                    sum = 5 * 24.80 * number;
                    break;
                case "Raspberry":
                    sum = 5 * 15.20 * number;
                    break;
            }
        }

        if (sum > 1000) {
            sum *= 0.50;
        } else if (sum >= 400) {
            sum *= 0.85;
        }
        System.out.printf("%.2f lv.", sum);
    }
}
