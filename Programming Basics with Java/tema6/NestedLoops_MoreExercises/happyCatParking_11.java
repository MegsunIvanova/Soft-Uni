package tema6.NestedLoops_MoreExercises;

import java.util.Scanner;

public class happyCatParking_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double total = 0.00;

        //За всеки четен ден и нечетен час, паркингът таксува 2.50 лева.
        //всеки нечетен ден и четен час таксата е 1.25 лева
        //във всички останали случаи се заплаща 1 лев.
        //Таксуването става на всеки изминал час от деня

        for (int currentDay = 1; currentDay <= days; currentDay++) {
            double sum = 0;
            for (int currentHour = 1; currentHour <= hours; currentHour++) {
                if ((currentDay * 1.00) % 2 == 0 && (currentHour * 1.00 % 2) != 0) {
                    sum += 2.50;
                } else if ((currentDay * 1.00) % 2 != 0 && (currentHour * 1.00 % 2) == 0) {
                    sum += 1.25;
                } else {
                    sum += 1.00;
                }

            }
            total += sum;
            System.out.printf("Day: %d - %.2f leva%n", currentDay, sum);
        }

        System.out.printf("Total: %.2f leva", total);
    }
}
