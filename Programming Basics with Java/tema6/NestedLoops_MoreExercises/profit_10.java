package tema6.NestedLoops_MoreExercises;

import java.util.Scanner;

public class profit_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oneLevNumber = Integer.parseInt(scanner.nextLine());
        int twoLevNumber = Integer.parseInt(scanner.nextLine());
        int fiveLevNumber = Integer.parseInt(scanner.nextLine());
        int amount = Integer.parseInt(scanner.nextLine());

        for (int oneLevPayment = 0; oneLevPayment <= oneLevNumber; oneLevPayment++) {
            for (int twoLevPayment = 0; twoLevPayment <= twoLevNumber; twoLevPayment++) {
                for (int fiveLevPayment = 0; fiveLevPayment <= fiveLevNumber; fiveLevPayment++) {
                    if (oneLevPayment + twoLevPayment * 2 + fiveLevPayment * 5 == amount) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n", oneLevPayment, twoLevPayment, fiveLevPayment,amount);
                    }
                }
            }
        }

    }
}
