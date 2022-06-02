package tema6.NestedLoops_Exercises;

import java.util.Scanner;

public class numberPyramid_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int currentNumber = 1;

        for (int rows = 1; rows <= n; rows++) {
            if (currentNumber > n) {
                break;
            }
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print(currentNumber + " ");
                currentNumber++;
                if (currentNumber > n) {
                    break;
                }
            }
            System.out.println("");
        }
    }
}
