package tema4.ForLoop_Lab;

import java.util.Scanner;

public class oddEvenSum_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                sumEven = sumEven + num;
            } else {
                sumOdd = sumOdd + num;
            }
        }

        int diff = Math.abs(sumEven - sumOdd);

        if (diff == 0) {
            System.out.printf("Yes%nSum = %d", sumEven);
        } else {
            System.out.printf("No%nDiff = %d", diff);
        }
    }
}
