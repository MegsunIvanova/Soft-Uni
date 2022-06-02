package PB_Exams_training;

import java.util.Scanner;

public class barcodeGenerator_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        for (int i = start; i <= end; i++) {
            boolean flag = false;
            int currentNumber = i;
            for (int j = 1; j <= 4; j++) {
                if (currentNumber % 2 == 0) {
                    flag = true;
                    break;
                }
                currentNumber /= 10;
            }
            if (!flag) {
                System.out.printf("%d ", i);
            }
        }
    }
}
