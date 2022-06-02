package tema6.NestedLoops_Exercises;

import java.util.Scanner;

public class sumPrimeNonPrime_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int sumPrimeNum = 0;
        int sumNonPrimeNum = 0;

        while (!input.equals("stop")) {
            int currentNumber = Integer.parseInt(input);
            if (currentNumber > 1 && currentNumber % 2 != 0 && currentNumber % 3 != 0 || currentNumber == 2 || currentNumber == 3) {
                sumPrimeNum += currentNumber;
            } else if (currentNumber >= 0) {
                sumNonPrimeNum += currentNumber;
            } else {
                System.out.println("Number is negative.");
            }
            input = scanner.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d%n", sumPrimeNum);
        System.out.printf("Sum of all non prime numbers is: %d%n", sumNonPrimeNum);
    }
}
