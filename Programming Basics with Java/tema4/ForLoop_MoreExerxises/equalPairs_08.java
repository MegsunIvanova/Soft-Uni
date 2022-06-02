package tema4.ForLoop_MoreExerxises;

import java.util.Scanner;

public class equalPairs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pairs = Integer.parseInt(scanner.nextLine());
        int value = 0;
        int maxDiff = 0;

        for (int i = 1; i <= pairs; i++) {
            int n1 = Integer.parseInt(scanner.nextLine());
            int n2 = Integer.parseInt(scanner.nextLine());

            if (i == 1) {
                value = n1 + n2;
            } else {
                if (!(value == n1 + n2)) {
                    int diff = Math.abs((n1 + n2) - value);
                    if (diff > maxDiff) {
                        maxDiff = diff;

                    }
                }
                value = n1 + n2;
            }

        }

        if (maxDiff == 0) {
            System.out.printf("Yes, value=%d%n", value);
        } else {
            System.out.printf("No, maxdiff=%d%n", maxDiff);
        }
    }

}
