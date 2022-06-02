package tema2.ConditionalStatements_MoreExercises;

import java.util.Scanner;

public class FuelTankPart2_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String fuel = scanner.nextLine();
        double fuelLitres = Double.parseDouble(scanner.nextLine());
        String clubCard = scanner.nextLine();
        boolean isThereClubCard = clubCard.equals("Yes");
        double pricePerLitre = 0;
        double discountPerLitre = 0;
        double percentDiscount = 0;

        if (fuel.equals("Gasoline")) {
            pricePerLitre = 2.22;
            if (isThereClubCard) {
                discountPerLitre = 0.18;
            }
        } else if (fuel.equals("Diesel")) {
            pricePerLitre = 2.33;
            if (isThereClubCard) {
                discountPerLitre = 0.12;
            }
        } else if (fuel.equals("Gas")) {
            pricePerLitre = 0.93;
            if (isThereClubCard) {
                discountPerLitre = 0.08;
            }
        }

        if (fuelLitres > 25) {
            percentDiscount = 0.10;

        } else if (fuelLitres >= 20) {
            percentDiscount = 0.08;
        }

        double finalPrice = (fuelLitres * (pricePerLitre - discountPerLitre)) * (1 - percentDiscount);

        System.out.printf("%.2f lv.", finalPrice);
    }
}
