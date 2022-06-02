package PB_Exams_training;

import java.util.Scanner;

public class easterCompetition_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int easterBreads = Integer.parseInt(scanner.nextLine());
        int leaderPoints = Integer.MIN_VALUE;
        String leadingBaker = "";


        for (int i = 1; i <= easterBreads; i++) {
            String currentBaker = scanner.nextLine();
            String input = scanner.nextLine();
            int currentPoints = 0;

            while (!input.equals("Stop")) {
                int points = Integer.parseInt(input);
                currentPoints += points;
                input = scanner.nextLine();
            }
            System.out.printf("%s has %d points.\n", currentBaker, currentPoints);
            if (currentPoints > leaderPoints) {
                leaderPoints = currentPoints;
                leadingBaker = currentBaker;
                System.out.printf("%s is the new number 1!\n", currentBaker);
            }
        }
        System.out.printf("%s won competition with %d points!", leadingBaker, leaderPoints);
    }
}
