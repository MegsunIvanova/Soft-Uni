package tema3.ConditionalStatementsAdvanced_MoreExercises;

import java.util.Scanner;

public class flowers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chrysanthemums = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();
        double price = 0;

        switch (season) {
            case "Spring":
            case "Summer":
                price = chrysanthemums * 2 + roses * 4.1 + tulips * 2.5;
                if (holiday.equals("Y")) {
                    price = price * 1.15;
                }
                if (season.equals("Spring") && tulips >= 7) {
                    price = price * 0.95;
                }
                break;
            case "Autumn":
            case "Winter":
                price = chrysanthemums * 3.75 + roses * 4.5 + tulips * 4.15;
                if (holiday.equals("Y")) {
                    price = price * 1.15;
                }
                if (season.equals("Winter") && roses >= 10) {
                    price = price * 0.9;
                }
                break;
        }
        if (chrysanthemums + roses + tulips > 20) {
            price = price * 0.8;
        }
        price = price + 2;
        System.out.printf("%.2f", price);
    }
}
