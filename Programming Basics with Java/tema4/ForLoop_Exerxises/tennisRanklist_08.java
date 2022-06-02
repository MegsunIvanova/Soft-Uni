package tema4.ForLoop_Exerxises;

import java.util.Scanner;

public class tennisRanklist_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tournaments = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());
        int wonTournaments = 0;
        int totalPoints = startingPoints;

        for (int i = 1; i <= tournaments; i++) {
            String result = scanner.nextLine();
            switch (result) {
                case "W":
                    totalPoints += 2000;
                    wonTournaments++;
                    break;
                case "F":
                    totalPoints += 1200;
                    break;
                case "SF":
                    totalPoints += 720;
                    break;
            }

        }

        double averagePoints = Math.floor((totalPoints-startingPoints) / tournaments);

        System.out.println("Final points: " + totalPoints);
        System.out.printf("Average points: %d%n",(int) averagePoints);
        System.out.printf("%.2f%%", (wonTournaments * 1.00 / tournaments) * 100);
    }
}
