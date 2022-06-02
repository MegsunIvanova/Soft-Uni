package tema6.NestedLoops_MoreExercises;

import java.util.Scanner;

public class theSongOfTheWheels_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int controlNumber = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        String password = "";

        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                if (!(a < b)) {
                    continue;
                }
                for (int c = 1; c <= 9; c++) {
                    for (int d = 1; d <= 9; d++) {
                        if (!(c > d)) {
                            continue;
                        }
                        if (a * b + c * d == controlNumber) {
                            counter++;
                            System.out.print("" + a + b + c + d + " ");
                            if (counter == 4) {
                                password = "" + a + b + c + d;
                            }
                        }
                    }
                }
            }
        }
        if (counter > 0) {
            System.out.println();
        }
        if (counter < 4) {
            System.out.println("No!");
        } else {
            System.out.println("Password: " + password);
        }
    }
}
