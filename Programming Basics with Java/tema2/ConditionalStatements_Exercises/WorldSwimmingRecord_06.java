package tema2.ConditionalStatements_Exercises;

import java.util.Scanner;

public class WorldSwimmingRecord_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timePerMeter = Double.parseDouble(scanner.nextLine());
        double numberOfDelays = Math.floor(distance / 15);
        double totalTime = distance * timePerMeter + numberOfDelays * 12.5;

        if (totalTime < record) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", (totalTime - record));
        }
    }
}
