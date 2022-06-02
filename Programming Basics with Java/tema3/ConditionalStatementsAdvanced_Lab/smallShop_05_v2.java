package tema3.ConditionalStatementsAdvanced_Lab;

import java.util.Scanner;

public class smallShop_05_v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0;

        switch (product) {
            case "coffee":
                switch (town) {
                    case "Sofia":
                        price = 0.5;
                        break;
                    case "Plovdiv":
                        price = 0.4;
                        break;
                    case "Varna":
                        price = 0.45;
                        break;
                }
                break;
            case "water":
                switch (town) {
                    case "Sofia":
                        price = 0.8;
                        break;
                    case "Plovdiv":
                        price = 0.7;
                        break;
                    case "Varna":
                        price = 0.7;
                        break;
                }
                break;
            case "beer":
                switch (town) {
                    case "Sofia":
                        price = 1.2;
                        break;
                    case "Plovdiv":
                        price = 1.15;
                        break;
                    case "Varna":
                        price = 1.1;
                        break;
                }
                break;
            case "sweets":
                switch (town) {
                    case "Sofia":
                        price = 1.45;
                        break;
                    case "Plovdiv":
                        price = 1.30;
                        break;
                    case "Varna":
                        price = 1.35;
                        break;
                }
                break;
            case "peanuts":
                switch (town) {
                    case "Sofia":
                        price = 1.6;
                        break;
                    case "Plovdiv":
                        price = 1.5;
                        break;
                    case "Varna":
                        price = 1.55;
                        break;
                }
                break;
        }
        System.out.println(quantity*price);
    }
}
