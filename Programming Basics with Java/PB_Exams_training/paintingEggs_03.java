package PB_Exams_training;

import java.util.Scanner;

public class paintingEggs_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String size = scanner.nextLine();
        String color = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());
        double income = 0;

        if (size.equals("Large")) {
            switch (color) {
                case "Red":
                    income = number * 16;
                    break;
                case "Green":
                    income = number * 12;
                    break;
                case "Yellow":
                    income = number * 9;
                    break;
            }
        } else if (size.equals("Medium")) {
            switch (color) {
                case "Red":
                    income = number * 13;
                    break;
                case "Green":
                    income = number * 9;
                    break;
                case "Yellow":
                    income = number * 7;
                    break;
            }
        } else if (size.equals("Small")) {
            switch (color) {
                case "Red":
                    income = number * 9;
                    break;
                case "Green":
                    income = number * 8;
                    break;
                case "Yellow":
                    income = number * 5;
                    break;
            }
        }

        double profit = income * 0.65;

        System.out.printf("%.2f leva.", profit);

    }
}
