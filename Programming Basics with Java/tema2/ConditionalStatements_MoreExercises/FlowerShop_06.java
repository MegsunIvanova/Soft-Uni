package tema2.ConditionalStatements_MoreExercises;

import java.util.Scanner;

public class FlowerShop_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int magnoliasNumber = Integer.parseInt(scanner.nextLine());
        int hyacinthsNumber = Integer.parseInt(scanner.nextLine());
        int rosesNumber = Integer.parseInt(scanner.nextLine());
        int cactiNumber = Integer.parseInt(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double profit = (magnoliasNumber * 3.25 + hyacinthsNumber * 4 + rosesNumber * 3.5 + cactiNumber * 8) * 0.95;

        if (profit >= giftPrice) {
            System.out.printf("She is left with %d leva.", (int) Math.floor(profit - giftPrice));
        } else {
            System.out.printf("She will have to borrow %d leva.", (int) Math.ceil(giftPrice - profit));
        }


    }
}
