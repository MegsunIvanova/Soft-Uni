package tema3.ConditionalStatementsAdvanced_MoreExercises;

import java.util.Scanner;

public class carToGo_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String carClass = "";
        String type = "";
        double price = 0;

        if (budget <= 100) {
            carClass = "Economy class";
            switch (season) {
                case "Summer":
                    type = "Cabrio";
                    price = budget * 0.35;
                    break;
                case "Winter":
                    type = "Jeep";
                    price = budget * 0.65;
                    break;
            }
        } else if (budget <= 500) {
            carClass = "Compact class";
            switch (season) {
                case "Summer":
                    type = "Cabrio";
                    price = budget * 0.45;
                    break;
                case "Winter":
                    type = "Jeep";
                    price = budget * 0.80;
                    break;
            }
        } else {
            carClass = "Luxury class";
            type = "Jeep";
            price = budget * 0.90;
        }

        System.out.println(carClass);
        System.out.printf("%s - %.2f",type,price);

    }
}
