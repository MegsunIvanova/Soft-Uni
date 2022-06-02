package tema2.ConditionalStatements_MoreExercises;

import java.util.Scanner;

public class Harvest_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vineyardArea = Integer.parseInt(scanner.nextLine());
        double grapePerSqMeter = Double.parseDouble(scanner.nextLine());
        int wineNeeded = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double totalGrape = vineyardArea * grapePerSqMeter;
        double totalWine = (totalGrape * 0.4) / 2.5;

        if (totalWine < wineNeeded) {
            // double wineShortage = Math.floor(wineNeeded - totalWine);
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(wineNeeded - totalWine));
        } else {
            double winePerPerson = Math.ceil((totalWine - wineNeeded) / workers);
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n" +
                    "%.0f liters left -> %.0f liters per person.", Math.ceil(totalWine),Math.ceil(totalWine-wineNeeded), winePerPerson);
        }


    }
}
