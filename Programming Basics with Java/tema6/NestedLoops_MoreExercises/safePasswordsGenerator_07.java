package tema6.NestedLoops_MoreExercises;

import java.util.Scanner;

public class safePasswordsGenerator_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int maxPasswords = Integer.parseInt(scanner.nextLine());
        String password = "";
        char charA = '#';
        char charB = '@';
        int counter = 0;

        for (int x = 1; x <= a; x++) {
            for (int y = 1; y <= b; y++) {

                if (maxPasswords <= counter) {
                    break;
                }
                if (charA > 55) {
                    charA = '#';
                }
                if (charB > 96) {
                    charB = '@';
                }
                password = "" + charA + charB + x + y + charB + charA;
                System.out.printf("%s|",password);
                charA++;
                charB++;
                counter++;
            }
        }


    }
}
