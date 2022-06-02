package tema3.ConditionalStatementsAdvanced_MoreExercises;

import java.util.Scanner;

public class schoolCamp_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        String groupType = scanner.nextLine();
        int students = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());

        String sport = "";
        double price = 0;

        if (groupType.equals("boys") || groupType.equals("girls")) {
            switch (season) {
                case "Winter":
                    price = 9.6 * students * nights;
                    if (groupType.equals("girls")) {
                        sport = "Gymnastics";
                    } else {
                        sport = "Judo";
                    }
                    break;
                case "Spring":
                    price = 7.2 * students * nights;
                    if (groupType.equals("girls")) {
                        sport = "Athletics";
                    } else {
                        sport = "Tennis";
                    }
                    break;
                case "Summer":
                    price = 15 * students * nights;
                    if (groupType.equals("girls")) {
                        sport = "Volleyball";
                    } else {
                        sport = "Football";
                    }
                    break;
            }
        } else if (groupType.equals("mixed")) {
            switch (season) {
                case "Winter":
                    price = 10 * students * nights;
                    sport = "Ski";
                    break;
                case "Spring":
                    price = 9.5 * students * nights;
                    sport = "Cycling";
                    break;
                case "Summer":
                    price = 20 * students * nights;
                    sport = "Swimming";
                    break;
            }
        }

        if (students >= 10 && students < 20) {
            price = price * 0.95;
        } else if (students >= 20 && students < 50) {
            price = price * 0.85;
        } else if (students >= 50) {
            price = price * 0.50;
        }

        System.out.printf("%s %.2f lv.", sport, price);
    }
}
