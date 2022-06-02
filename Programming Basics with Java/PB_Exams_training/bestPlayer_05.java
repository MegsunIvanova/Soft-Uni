package PB_Exams_training;

import java.util.Scanner;

public class bestPlayer_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String player = scanner.nextLine();
        String bestPlayer = "";
        int goalsBestPlayer = 0;

        while (!player.equals("END")) {
            int goals = Integer.parseInt(scanner.nextLine());
            if (goals > goalsBestPlayer) {
                bestPlayer = player;
                goalsBestPlayer = goals;
            }
            if (goals >= 10) {
                break;
            }

            player = scanner.nextLine();
        }
        System.out.printf("%s is the best player!\n", bestPlayer);

        if (goalsBestPlayer >= 3) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", goalsBestPlayer);
        } else {
            System.out.printf("He has scored %d goals.", goalsBestPlayer);
        }
    }
}
