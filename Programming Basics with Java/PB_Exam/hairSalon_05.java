package PB_Exam;

import java.util.Scanner;

public class hairSalon_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double target = Double.parseDouble(scanner.nextLine());
        double dayIncome = 0;
        boolean isSucceeded = false;

        String typeOfService = scanner.nextLine();

        while (!typeOfService.equals("closed")) {
            if (typeOfService.equals("haircut")) {
                String typeOfHaircut = scanner.nextLine();
                switch (typeOfHaircut) {
                    case "mens":
                        dayIncome += 15;
                        break;
                    case "ladies":
                        dayIncome += 20;
                        break;
                    case "kids":
                        dayIncome += 10;
                        break;
                }
            } else if (typeOfService.equals("color")) {
                String typeOfColor = scanner.nextLine();
                switch (typeOfColor) {
                    case "touch up":
                        dayIncome += 20;
                        break;
                    case "full color":
                        dayIncome += 30;
                        break;
                }
            }
            if (dayIncome >= target) {
                isSucceeded = true;
                break;
            }
            typeOfService = scanner.nextLine();
        }


        if (isSucceeded) {
            System.out.println("You have reached your target for the day!");
        } else {
            System.out.printf("Target not reached! You need %.0flv. more.\n", target - dayIncome);
        }
        System.out.printf("Earned money: %.0flv.", dayIncome);
    }
}
