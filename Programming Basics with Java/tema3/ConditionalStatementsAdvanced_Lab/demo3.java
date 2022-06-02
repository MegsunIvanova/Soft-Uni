package tema3.ConditionalStatementsAdvanced_Lab;

import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int price = Integer.parseInt(scanner.nextLine());


        //Даваме отстъпка в понеделник, ако сумата е по-голяма от 100 лв.
        if (day.equals("Monday")) {

            if (price > 100) {
                System.out.println("Discount - 10%");
            } else {
                System.out.println("The price is lower than 100!");
            }

        } else {

            if (price > 200) {
                System.out.println("You get 5% discount");
            }
        }

    }
}
