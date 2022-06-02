package tema6.NestedLoops_Lap;

import java.util.Scanner;

public class sumOfTwoNumbers_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int count = 0;
        boolean flag = false;


        for (int i = n1; i <= n2; i++) {
            for (int j = n1; j <= n2; j++) {
                count++;
                if (i + j == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", count, i, j, magicNumber);
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }

        if (!flag) {
            System.out.printf("%d combinations - neither equals %d", count, magicNumber);
        }
    }
}
