package tema4.ForLoop_Exerxises;

import java.util.Scanner;

public class oscars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String actor = scanner.nextLine();
        double totalPoints = Double.parseDouble(scanner.nextLine());
        int numberJudges = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= numberJudges; i++) {
            String name = scanner.nextLine();
            double points = Double.parseDouble(scanner.nextLine());
            totalPoints += (points * name.length()) / 2;
            if (totalPoints > 1250.50) {
                i = numberJudges + 1;
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actor, totalPoints);
            } else if (i == numberJudges && totalPoints <= 1250.50) {
                System.out.printf ("Sorry, %s you need %.1f more!",actor, (1250.50-totalPoints));
            }
        }


    }
}
