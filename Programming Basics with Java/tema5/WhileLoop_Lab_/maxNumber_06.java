package tema5.WhileLoop_Lab_;

import java.util.Scanner;

public class maxNumber_06 {
    public static void main(String[] args) {
        //Напишете програма, която до получаване на командата "Stop",
        // чете цели числа, въведени от потребителя и намира най-голямото измежду тях.
        // Въвежда се по едно число на ред.
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int maxNum = Integer.MIN_VALUE;

        while (!input.equals("Stop")) {
            int number = Integer.parseInt(input);
            if (number > maxNum) {
                maxNum = number;
            }
            input = scanner.nextLine();
        }

        System.out.println(maxNum);
    }
}
