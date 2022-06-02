package PB_Exams_training;

import java.util.Scanner;

public class basketballTournament_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tournamentName = scanner.nextLine();
        int winCounter = 0;
        int lostCounter = 0;
        int gamesCounter = 0;

        while (!tournamentName.equals("End of tournaments")) {

            int n = Integer.parseInt(scanner.nextLine());
            gamesCounter += n;

            for (int i = 1; i <= n; i++) {
                int pointsDesiTeam = Integer.parseInt(scanner.nextLine());
                int pointsOpponent = Integer.parseInt(scanner.nextLine());
                int diff = pointsDesiTeam - pointsOpponent;
                if (diff > 0) {
                    System.out.printf("Game %d of tournament %s: win with %d points.%n", i, tournamentName, diff);
                    winCounter++;
                } else if (diff < 0) {
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n", i, tournamentName, -diff);
                    lostCounter++;
                }
            }

            tournamentName = scanner.nextLine();
        }

        double winPercentage = winCounter * 100.00 / gamesCounter;
        double lostPercentage = lostCounter * 100.00 / gamesCounter;

        System.out.printf("%.2f%% matches win%n", winPercentage);
        System.out.printf("%.2f%% matches lost%n", lostPercentage);

    }
}
