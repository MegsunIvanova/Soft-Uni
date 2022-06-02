package tema3.ConditionalStatementsAdvanced_MoreExercises;

import java.util.Scanner;

public class multiplyBy2_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());

        while (n >= 0) {
            n *= 2;
            System.out.printf("Result: %.2f%n", n);
            double n1 = Double.parseDouble(scanner.nextLine());
            n=n1;
        }

        System.out.println("Negative number!");
    }
}
