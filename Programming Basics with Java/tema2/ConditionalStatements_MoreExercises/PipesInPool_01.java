package tema2.ConditionalStatements_MoreExercises;

import java.util.Scanner;

public class PipesInPool_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int v = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double pouredWater = (p1 + p2) * h;

        if (pouredWater <= v) {
            double filledVolume = (pouredWater / (double) v) * 100;
            double p1FilledVolume = ((p1 * h) / pouredWater) * 100;
            double p2FilledVolume = ((p2 * h) / pouredWater) * 100;
            char pr = '%';


            System.out.printf("The pool is %.2f%c full. " +
                    "Pipe 1: %.2f%c. " +
                    "Pipe 2: %.2f%c.", filledVolume, pr, p1FilledVolume, pr, p2FilledVolume, pr);
        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", h, (pouredWater - v));
        }


    }
}

