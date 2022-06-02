package tema6.NestedLoops_MoreExercises;

import java.util.Scanner;

public class uniquePINCodes_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());
        boolean isPrime = false;

        for (int x = 2; x <= firstNum; x += 2) {
            int y = 2;
            while (y <= secondNum) {
                if ((y % 2 != 0 && y % 3 != 0) || y == 2 || y == 3) {
                    for (int z = 2; z <= thirdNum; z += 2) {
                        String code = x + " " + y + " " + z;
                        System.out.println(code);
                    }
                }
                y++;
            }

        }

    }
}
