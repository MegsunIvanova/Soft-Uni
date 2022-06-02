package tema6.NestedLoops_MoreExercises;

import java.util.Scanner;

public class lettersCombinations_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char startLetter = scanner.nextLine().charAt(0);
        char endLetter = scanner.nextLine().charAt(0);
        char missingLetter = scanner.nextLine().charAt(0);
        int counter = 0;

        for (int firstLetter = startLetter; firstLetter <= endLetter; firstLetter++) {
            if (firstLetter == missingLetter) {
                continue;
            }
            for (int secondLetter = startLetter; secondLetter <= endLetter; secondLetter++) {
                if (secondLetter == missingLetter) {
                    continue;
                }
                for (int thirdLetter = startLetter; thirdLetter <= endLetter; thirdLetter++) {
                    if (thirdLetter == missingLetter) {
                        continue;
                    }
                    String code = "" + (char) firstLetter + (char) secondLetter + (char) thirdLetter;
                    System.out.printf(code + " ");
                    counter++;
                }

            }
        }
        System.out.println(counter);
    }
}
