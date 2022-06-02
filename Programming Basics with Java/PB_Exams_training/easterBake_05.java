package PB_Exams_training;

import java.util.Scanner;

public class easterBake_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfEasterBreads = Integer.parseInt(scanner.nextLine());
        int maxUsedSugar = Integer.MIN_VALUE;
        int maxUsedFlour = Integer.MIN_VALUE;
        int totalSugarUsed = 0;
        int totalFlourUsed = 0;


        for (int i = 1; i <= numberOfEasterBreads; i++) {
            int sugar = Integer.parseInt(scanner.nextLine());
            int flour = Integer.parseInt(scanner.nextLine());
            totalSugarUsed += sugar;
            totalFlourUsed += flour;
            if (sugar > maxUsedSugar) {
                maxUsedSugar = sugar;
            }
            if (flour > maxUsedFlour) {
                maxUsedFlour = flour;
            }
        }

        double packetsOfSugar = Math.ceil(totalSugarUsed * 1.0 / 950);
        double packetsOfFlour = Math.ceil(totalFlourUsed * 1.0 / 750);

        System.out.printf("Sugar: %.0f\n", packetsOfSugar);
        System.out.printf("Flour: %.0f\n", packetsOfFlour);
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.", maxUsedFlour, maxUsedSugar);

    }
}
