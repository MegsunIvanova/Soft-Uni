package tema4.ForLoop_Exerxises;

import java.util.Scanner;

public class cleverLily_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double priceWM = Double.parseDouble(scanner.nextLine());
        double priceToy = Double.parseDouble(scanner.nextLine());
        double moneySaved = 0;
        int countToys = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                moneySaved += 10 * i / 2 - 1;
            } else {
                countToys++;
            }
        }

        moneySaved += (countToys * priceToy);

        if (moneySaved >= priceWM) {
            System.out.printf("Yes! %.2f", moneySaved - priceWM);
        } else {
            System.out.printf("No! %.2f", priceWM - moneySaved);
        }
    }
}
