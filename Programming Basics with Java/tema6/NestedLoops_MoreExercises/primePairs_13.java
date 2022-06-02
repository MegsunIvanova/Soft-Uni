package tema6.NestedLoops_MoreExercises;

import java.util.Scanner;

public class primePairs_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumFirstPair = Integer.parseInt(scanner.nextLine());
        int startNumSecondPair = Integer.parseInt(scanner.nextLine());
        int diffFirstPair = Integer.parseInt(scanner.nextLine());
        int diffSecondPair = Integer.parseInt(scanner.nextLine());

        for (int firstPair = startNumFirstPair; firstPair <= startNumFirstPair + diffFirstPair; firstPair++) {
            if ((firstPair % 2.00 == 0) || (firstPair % 3.00 == 0) || (firstPair % 5.00 == 0) || (firstPair % 7.00 == 0)) {
                continue;
            }
            for (int secondPair = startNumSecondPair; secondPair <= startNumSecondPair + diffSecondPair; secondPair++) {
                if ((secondPair % 2.00 == 0) || (secondPair % 3.00 == 0) || (secondPair % 5.00 == 0) || (secondPair % 7.00 == 0)) {
                    continue;
                }
                System.out.println("" + firstPair + secondPair);
            }
        }
    }
}
