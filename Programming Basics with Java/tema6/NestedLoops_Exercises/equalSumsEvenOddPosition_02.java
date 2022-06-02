package tema6.NestedLoops_Exercises;

import java.util.Scanner;

public class equalSumsEvenOddPosition_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());
        int evenSum = 0;
        int oddSum = 0;

        for (int i = startingNumber; i <= endNumber; i++) {
            String text = i+"";
            for (int j = 0; j < text.length(); j++) {
                if ((j + 1) % 2 == 0) {
                    evenSum += text.charAt(j);
                } else {
                    oddSum += text.charAt(j);
                }
            }
            if (evenSum == oddSum) {
                System.out.printf(text + " ");
            }
            evenSum = 0;
            oddSum = 0;
        }


    }
}
