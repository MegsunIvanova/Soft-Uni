package PB_Exam;

import java.util.Scanner;

public class grandpaStavri_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double totalQuantity = 0;
        double sumOfAlcoholDegree = 0;

        for (int i = 1; i <= days; i++) {
            double currentQuantity = Double.parseDouble(scanner.nextLine());
            double currentAlcoholDegree = Double.parseDouble(scanner.nextLine());
            totalQuantity += currentQuantity;
            sumOfAlcoholDegree += currentAlcoholDegree * currentQuantity;
        }

        double averageAlcoholDegree = sumOfAlcoholDegree / totalQuantity;
        System.out.printf("Liter: %.2f\n", totalQuantity);
        System.out.printf("Degrees: %.2f\n", averageAlcoholDegree);
        if (averageAlcoholDegree > 42) {
            System.out.println("Dilution with distilled water!");
        } else if (averageAlcoholDegree >= 38) {
            System.out.println("Super!");
        } else {
            System.out.println("Not good, you should baking!");
        }

    }
}
