package tema5.WhileLoop_MoreExercises;

import java.util.Scanner;

public class averageNumber_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= numbers; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            sum += currentNumber;
        }

        double average = sum * 1.00 / numbers;

        System.out.printf("%.2f", average);

    }
}
