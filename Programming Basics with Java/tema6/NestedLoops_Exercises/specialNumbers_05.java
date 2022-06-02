package tema6.NestedLoops_Exercises;

import java.util.Scanner;

public class specialNumbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1111; i <= 9999; i++) {
            String number = "" + i;
            boolean isMagic = false;
            for (int j = 0; j < number.length(); j++) {
                double currentDigit = Integer.parseInt("" + number.charAt(j));
                ;
                if (n % currentDigit != 0) {
                    isMagic = false;
                    break;
                }
                isMagic = true;
            }
            if (isMagic) {
                System.out.printf(i + " ");
            }
        }
    }
}
