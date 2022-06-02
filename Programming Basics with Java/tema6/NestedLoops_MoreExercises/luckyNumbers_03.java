package tema6.NestedLoops_MoreExercises;

import java.util.Scanner;

public class luckyNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());

        for (int i = 1111; i <= 9999; i++) {
            boolean isZero = false;
            String number = "" + i;
            //всяка цифра от числото е в интервала [1...9]
            for (int j = 0; j < number.length(); j++) {
                if (number.charAt(j)-48 == 0) {
                    isZero = true;
                    break;
                }
            }
            if (isZero) {
                continue;
            }
            //сбора от първите две цифри е равен на сбора от последните две
            int firstPairSum = number.charAt(0)-48 + number.charAt(1)-48;
            int secondPairSum = number.charAt(2)-48 + number.charAt(3)-48;
            if (firstPairSum != secondPairSum) {
                continue;
            }
            //Числото N трябва да се дели без остатък
            // от сбора на първите две цифри на "щастливото" число
            if (n % firstPairSum != 0) {
                continue;
            }

            System.out.print(i + " ");
        }

    }
}
