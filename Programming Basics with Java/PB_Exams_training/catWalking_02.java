package PB_Exams_training;

import java.util.Scanner;

public class catWalking_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int walkMinutes = Integer.parseInt(scanner.nextLine());
        int walksNumber = Integer.parseInt(scanner.nextLine());
        int calories = Integer.parseInt(scanner.nextLine());

        int burnedCalories = walkMinutes * walksNumber * 5;

        if (burnedCalories >= calories / 2.0) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", burnedCalories);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", burnedCalories);
        }

    }
}
