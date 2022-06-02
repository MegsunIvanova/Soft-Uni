package tema2.ConditionalStatements_MoreExercises;

import java.util.Scanner;

public class SleepyTomCat_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int holidays = Integer.parseInt(scanner.nextLine());

        int gameTime = holidays*127+(365-holidays)*63;
        int totalDeviation = 30000-gameTime;
        int deviationHours = Math.abs(totalDeviation/60);
        int deviationMinutes = Math.abs(totalDeviation%60);

        if (totalDeviation>=0){
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play",deviationHours,deviationMinutes);
        } else {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play",deviationHours,deviationMinutes);
        }
    }
}
