package tema4.ForLoop_Exerxises;

import java.util.Scanner;

public class halfSumElement_02_v02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int maxNum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int currentnum = Integer.parseInt(scanner.nextLine());
            if (currentnum > maxNum) {
                maxNum = currentnum;
            }
            sum += currentnum;
        }

        int sumWithoutMaxNum = sum - maxNum;

        if (sumWithoutMaxNum == maxNum) {
            System.out.println("Yes");
            System.out.println("Sum = " + sumWithoutMaxNum);
        } else {
            System.out.println("No");
            System.out.println("Diff = " + (Math.abs(maxNum - sumWithoutMaxNum)));
        }
    }
}
