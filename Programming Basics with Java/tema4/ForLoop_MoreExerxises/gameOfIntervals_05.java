package tema4.ForLoop_MoreExerxises;

import java.util.Scanner;

public class gameOfIntervals_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int movements = Integer.parseInt(scanner.nextLine());
        double result = 0;
        int numbersFrom0to9 = 0;
        int numbersFrom10to19 = 0;
        int numbersFrom20to29 = 0;
        int numbersFrom30to39 = 0;
        int numbersFrom40to50 = 0;
        int invalidNumbers = 0;


        for (int i = 1; i <= movements; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number >= 0 && number < 10) {
                result += number * 0.20;
                numbersFrom0to9++;
            } else if (number >= 10 && number < 20) {
                result += number * 0.30;
                numbersFrom10to19++;
            } else if (number >= 20 && number < 30) {
                result += number * 0.40;
                numbersFrom20to29++;
            } else if (number >= 30 && number < 40) {
                result += 50;
                numbersFrom30to39++;
            } else if (number >= 40 && number <= 50) {
                result += 100;
                numbersFrom40to50++;
            } else {
                result /= 2;
                invalidNumbers++;
            }
        }

        System.out.printf("%.2f%n", result);
        System.out.printf("From 0 to 9: %.2f%%%n", (numbersFrom0to9 * 1.00 / movements) * 100);
        System.out.printf("From 10 to 19: %.2f%%%n", (numbersFrom10to19 * 1.00 / movements) * 100);
        System.out.printf("From 20 to 29: %.2f%%%n", (numbersFrom20to29 * 1.00 / movements) * 100);
        System.out.printf("From 30 to 39: %.2f%%%n", (numbersFrom30to39 * 1.00 / movements) * 100);
        System.out.printf("From 40 to 50: %.2f%%%n", (numbersFrom40to50 * 1.00 / movements) * 100);
        System.out.printf("Invalid numbers: %.2f%%%n", (invalidNumbers * 1.00 / movements) * 100);

    }
}
