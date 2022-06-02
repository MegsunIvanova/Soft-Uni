package PB_Exams_training;

import java.util.Scanner;

public class nameGame_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String winner = "";
        int winnerPoints = Integer.MIN_VALUE;

        while (!name.equals("Stop")) {
            int currentPoints = 0;
            for (int i = 0; i < name.length(); i++) {
                int number = Integer.parseInt(scanner.nextLine());
                if (number == name.charAt(i)) {
                    currentPoints += 10;
                } else {
                    currentPoints += 2;
                }
            }
            if (currentPoints >= winnerPoints) {
                winnerPoints = currentPoints;
                winner = name;
            }

            name = scanner.nextLine();
        }

        System.out.printf("The winner is %s with %d points!", winner, winnerPoints);
    }
}
