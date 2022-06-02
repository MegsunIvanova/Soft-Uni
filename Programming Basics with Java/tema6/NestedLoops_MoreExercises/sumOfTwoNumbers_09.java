package tema6.NestedLoops_MoreExercises;

import java.util.Scanner;

public class sumOfTwoNumbers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intervalStart = Integer.parseInt(scanner.nextLine());
        int intervalEnd = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean isFound = false;

        for (int firstNum = intervalStart; firstNum <= intervalEnd; firstNum++) {
            if (isFound){
                break;
            }
            for (int secondNum = intervalStart; secondNum <= intervalEnd; secondNum++) {
                counter++;
                if (firstNum + secondNum == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, firstNum, secondNum, magicNumber);
                    isFound = true;
                    break;
                }
            }
        }
        if (!isFound) {
            System.out.printf("%d combinations - neither equals %d", counter, magicNumber);
        }
    }
}
