package tema1.FirstStepsInCoding_PB_Exercises;

import java.util.Scanner;

public class SuppliesForSchool_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int PensNum = Integer.parseInt(scanner.nextLine());
        int MarkersNum = Integer.parseInt(scanner.nextLine());
        int CleanerNum = Integer.parseInt(scanner.nextLine());
        double discountPercent = Double.parseDouble(scanner.nextLine());
        double requiredAmount = (PensNum * 5.8 + MarkersNum * 7.2 + CleanerNum * 1.2) * (1 - discountPercent / 100);
        System.out.println(requiredAmount);

    }
}
