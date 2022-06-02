package tema5.WhileLoop_Exercises;

import java.util.Scanner;

public class vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scanner.nextLine());
        double savings = Double.parseDouble(scanner.nextLine());
        int countDays = 0;

        int spendingDays = 0;


        while (savings < tripPrice) {

            String transaction = scanner.nextLine();
            double amount = Double.parseDouble(scanner.nextLine());
            countDays++;

            switch (transaction) {
                case "spend":
                    spendingDays++;
                    if (savings > amount) {
                        savings -= amount;
                    } else {
                        savings = 0;
                    }
                    break;

                case "save":
                    spendingDays = 0;
                    savings += amount;
            }

            if (spendingDays >= 5) {
                break;
            }
        }
        if (spendingDays == 5) {
            System.out.println("You can't save the money.");
            System.out.println(countDays);
        } else {
            System.out.printf("You saved the money for %d days.", countDays);
        }

    }
}
