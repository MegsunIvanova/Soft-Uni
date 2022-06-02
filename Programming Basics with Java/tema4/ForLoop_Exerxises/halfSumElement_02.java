package tema4.ForLoop_Exerxises;

import java.util.Scanner;

public class halfSumElement_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int maxNum = Integer.MIN_VALUE;
        int sumAllNum = 0;


        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sumAllNum += num;
            if (num > maxNum) {
                maxNum = num;
            }
        }

        if (sumAllNum - maxNum * 2 == 0) {
            System.out.println("Yes");
            System.out.println("Sum = " + maxNum);
        } else {
            System.out.println("No");
            System.out.println("Diff = " + (Math.abs(maxNum * 2 - sumAllNum)));
        }
    }
}
