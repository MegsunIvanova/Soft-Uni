package tema1.FirstStepsInCoding_PB_Exercises;

import java.util.Scanner;

public class BasketballEquipment_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int basketballAnnualFee = Integer.parseInt(scanner.nextLine());
        double sneakersPrice = basketballAnnualFee * 0.60;
        double outfitPrice = sneakersPrice * 0.80;
        double ballPrice = outfitPrice * 0.25;
        double accessoriesPrice = ballPrice * 0.20;

        double totalExpenses = basketballAnnualFee + sneakersPrice + outfitPrice + ballPrice + accessoriesPrice;
        System.out.println(totalExpenses);

    }
}
