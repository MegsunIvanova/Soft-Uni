package tema6.NestedLoops_MoreExercises;

import java.util.Scanner;

public class secretDoorSLock_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxHundreds = Integer.parseInt(scanner.nextLine());
        int maxTens = Integer.parseInt(scanner.nextLine());
        int maxUnits = Integer.parseInt(scanner.nextLine());
//•	Цифрата на единиците и цифрата на стотиците трябва да бъде четна
//•	Цифрата на десетиците да бъде просто число в диапазона (2...7).
        for (int hundreds = 2; hundreds <= maxHundreds; hundreds += 2) {
            for (int tens = 2; tens <= maxTens; tens++) {
                if ((tens == 4 || tens == 6 || tens == 8 || tens == 9)) {
                    continue;
                }
                for (int units = 2; units <= maxUnits; units += 2) {
                    System.out.println(hundreds + " " + tens + " " + units);
                }
            }
        }
    }
}
