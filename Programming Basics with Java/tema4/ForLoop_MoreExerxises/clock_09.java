package tema4.ForLoop_MoreExerxises;

import java.util.Scanner;

public class clock_09 {
    public static void main(String[] args) {

        for (int hour = 0; hour <= 23; hour++) {
            for (int minutes = 0; minutes <= 59; minutes++)
                if (minutes < 10) {
                    System.out.printf("%d:0%d%n", hour, minutes);
                } else {
                    System.out.printf("%d:%d%n", hour, minutes);
                }
        }

    }
}
