package PB_Exams_training;

import java.util.Scanner;

public class tennisRanklist_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfTournaments = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());
        int tournamentsPoints = 0;
        int numberWonTournaments = 0;

        for (int i = 1; i <= numberOfTournaments; i++) {
            String result = scanner.nextLine();
            switch (result) {
                case "W":
                    tournamentsPoints += 2000;
                    numberWonTournaments++;
                    break;
                case "F":
                    tournamentsPoints += 1200;
                    break;
                case "SF":
                    tournamentsPoints += 720;
                    break;
            }
        }
        System.out.printf("Final points: %d\n", startingPoints + tournamentsPoints);
        System.out.printf("Average points: %d\n", tournamentsPoints / numberOfTournaments);
        System.out.printf("%.2f%%", numberWonTournaments * 100.0 / numberOfTournaments);


    }
}
