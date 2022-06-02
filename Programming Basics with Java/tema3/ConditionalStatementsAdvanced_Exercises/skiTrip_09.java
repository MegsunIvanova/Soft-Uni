package tema3.ConditionalStatementsAdvanced_Exercises;

import java.util.Scanner;

public class skiTrip_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String evaluation = scanner.nextLine();
        double price = 0;

        switch (type) {
            case "room for one person":
                price = 18 * (days - 1);
                break;
            case "apartment":
                price = 25 * (days - 1);
                if (days < 10) {
                    price = price * 0.70;
                } else if (days >= 10 && days <= 15) {
                    price = price * 0.65;
                } else if (days > 15) {
                    price = price * 0.5;
                }
                break;
            case "president apartment":
                price = 35 * (days - 1);
                if (days < 10) {
                    price = price * 0.90;
                } else if (days >= 10 && days <= 15) {
                    price = price * 0.85;
                } else if (days > 15) {
                    price = price * 0.80;
                }
                break;
        }
        if (evaluation.equals("positive")) {
            price = price * 1.25;
        } else if (evaluation.equals("negative")) {
            price = price * 0.90;
        }

        System.out.printf("%.2f", price);
    }
}

