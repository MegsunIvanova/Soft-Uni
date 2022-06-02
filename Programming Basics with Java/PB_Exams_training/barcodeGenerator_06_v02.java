package PB_Exams_training;

import java.util.Scanner;

public class barcodeGenerator_06_v02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        for (int i = start / 1000; i <= end / 1000; i++) {
            if (i % 2 == 0) {
                continue;
            }
            for (int j = (start / 100) % 10; j <= (end / 100) % 10; j++) {
                if (j % 2 == 0) {
                    continue;
                }
                for (int k = (start / 10) % 10; k <= (end / 10) % 10; k++) {
                    if (k % 2 == 0) {
                        continue;
                    }
                    for (int l = start % 10; l <= end % 10; l++) {
                        if (l % 2 == 0) {
                            continue;
                        }
                        System.out.printf("%d%d%d%d ", i, j, k, l);
                    }
                }
            }
        }
    }
}
