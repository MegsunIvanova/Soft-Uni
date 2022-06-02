package PB_Exams_training;

import java.util.Scanner;

public class movieTickets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = Integer.parseInt(scanner.nextLine());
        int a2 = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = a1; i < a2; i++) {
            if (i % 2 == 0) {
                continue;
            }
            for (int j = 1; j < n; j++) {
                for (int k = 1; k < n / 2; k++) {
                    if ((j + k + i) % 2 == 0) {
                        continue;
                    }
                    System.out.printf("%c-%d%d%d\n", i, j, k, i);
                }

            }
        }
    }
}
