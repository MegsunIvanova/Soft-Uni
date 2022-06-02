package tema2.ConditionalStatements_MoreExercises;

import java.util.Scanner;

public class Pets_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int foodProvidedKg = Integer.parseInt(scanner.nextLine());
        double dogFoodKg = Double.parseDouble(scanner.nextLine());
        double catFoodKg = Double.parseDouble(scanner.nextLine());
        double turtleFoodGr = Double.parseDouble(scanner.nextLine());

        double foodNeeded = (dogFoodKg + catFoodKg + turtleFoodGr / 1000) * days;

        if (foodNeeded <= foodProvidedKg) {
            System.out.println((int) Math.floor(foodProvidedKg - foodNeeded) + " kilos of food left.");
        } else {
            System.out.println((int) Math.ceil(foodNeeded - foodProvidedKg) + " more kilos of food are needed.");
        }
    }
}
