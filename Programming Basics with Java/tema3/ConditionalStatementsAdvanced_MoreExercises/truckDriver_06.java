package tema3.ConditionalStatementsAdvanced_MoreExercises;

import java.util.Scanner;

public class truckDriver_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        double kmMonthly = Double.parseDouble(scanner.nextLine());
        double earnings = 0;

        if (kmMonthly <= 5000) {
            if (season.equals("Spring") || season.equals("Autumn")) {
                earnings = (kmMonthly * 0.75 * 4) * 0.90;
            } else if (season.equals("Summer")) {
                earnings = (kmMonthly * 0.90 * 4) * 0.90;
            } else if (season.equals("Winter")) {
                earnings = (kmMonthly * 1.05 * 4) * 0.90;
            }
        } else if (kmMonthly > 5000 && kmMonthly <= 10000) {
            if (season.equals("Spring") || season.equals("Autumn")) {
                earnings = (kmMonthly * 0.95 * 4) * 0.90;
            } else if (season.equals("Summer")) {
                earnings = (kmMonthly * 1.1 * 4) * 0.90;
            } else if (season.equals("Winter")) {
                earnings = (kmMonthly * 1.25 * 4) * 0.90;
            }
        } else if (kmMonthly > 10000 && kmMonthly <= 20000) {
            earnings = (kmMonthly * 1.45 * 4) * 0.90;
        }

        System.out.printf("%.2f",earnings);
    }
}
