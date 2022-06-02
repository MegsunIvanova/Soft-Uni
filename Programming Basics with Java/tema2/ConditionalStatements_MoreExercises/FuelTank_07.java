package tema2.ConditionalStatements_MoreExercises;

import java.util.Scanner;

public class FuelTank_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuel = scanner.nextLine();
        int litters = Integer.parseInt(scanner.nextLine());

        if (fuel.equals("Diesel")) {
            if (litters >= 25) {
                System.out.println("You have enough diesel.");
            } else {
                System.out.println("Fill your tank with diesel!");
            }
        } else if (fuel.equals("Gasoline")) {
            if (litters >= 25) {
                System.out.println("You have enough gasoline.");
            } else {
                System.out.println("Fill your tank with gasoline!");
            }
        } else if (fuel.equals("Gas")) {
            if (litters >= 25) {
                System.out.println("You have enough gas.");
            } else {
                System.out.println("Fill your tank with gas!");
            }
        } else {
            System.out.println("Invalid fuel!");
        }
    }
}
