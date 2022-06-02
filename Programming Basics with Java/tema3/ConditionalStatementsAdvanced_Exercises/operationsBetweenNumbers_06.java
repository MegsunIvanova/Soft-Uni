package tema3.ConditionalStatementsAdvanced_Exercises;

import java.util.Scanner;

public class operationsBetweenNumbers_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        if (n2 == 0 && (operator.equals("/") || operator.equals("%"))) {
            System.out.printf("Cannot divide %d by zero", n1);

        } else if (operator.equals("+") || operator.equals("-") || operator.equals("*")) {
            int result = 0;
            switch (operator) {
                case "+":
                    result = n1 + n2;
                    break;
                case "-":
                    result = n1 - n2;
                    break;
                case "*":
                    result = n1 * n2;
                    break;
            }

            if (result % 2 == 0) {
                System.out.printf("%d %s %d = %d - even", n1, operator, n2, result);
            } else {
                System.out.printf("%d %s %d = %d - odd", n1, operator, n2, result);
            }
        } else if (operator.equals("/")) {
            double result = (double) n1 / (double) n2;
            System.out.printf("%d %s %d = %.2f", n1, operator, n2, result);
        } else if (operator.equals("%")) {
            System.out.printf("%d %s %d = %d", n1, operator, n2, (n1 % n2));
        }

    }
}

