package tema4.ForLoop_MoreExerxises;

import java.util.Scanner;

public class backToThePast_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inheritance = Double.parseDouble(scanner.nextLine());
        int targetYear = Integer.parseInt(scanner.nextLine());

        double moneyNeeded = 0;

        for (int i = 1800; i <= targetYear; i++) {
            if (i % 2 == 0) {
                moneyNeeded += 12000;
            } else {
                moneyNeeded += (12000 + 50 * (18 + i - 1800));
            }
        }

        double diff = Math.abs(inheritance - moneyNeeded);

        if (inheritance >= moneyNeeded) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", diff);

        } else {
            System.out.printf("He will need %.2f dollars to survive.", diff);

        }
    }
}
