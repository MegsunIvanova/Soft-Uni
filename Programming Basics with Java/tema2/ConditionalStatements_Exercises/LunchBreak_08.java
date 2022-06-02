package tema2.ConditionalStatements_Exercises;

import java.util.Scanner;

public class LunchBreak_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double episodeDuration = Double.parseDouble(scanner.nextLine());
        double breakDuration = Double.parseDouble(scanner.nextLine());

        double lunchDuration = breakDuration / 8;
        double restDuration = breakDuration / 4;

        double remainingTime = breakDuration - lunchDuration - restDuration;

        double result = (remainingTime - episodeDuration);

        if (result >= 0) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", name, Math.ceil(result));
        } else {

            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", name, Math.abs(Math.floor(result)));
        }


    }
}
