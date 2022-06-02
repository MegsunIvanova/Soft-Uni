package PB_Exams_training;

import java.util.Scanner;

public class careOfPuppy_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int food = Integer.parseInt(scanner.nextLine()) * 1000;
        String input = scanner.nextLine();
        boolean flag = false;

        while (!input.equals("Adopted")) {
            int eatenFood = Integer.parseInt(input);
            food -= eatenFood;

            input = scanner.nextLine();
        }

        if (food < 0) {
            System.out.printf("Food is not enough. You need %d grams more.", -food);
        } else {
            System.out.printf("Food is enough! Leftovers: %d grams.", food);
        }
    }
}
