package PB_Exams_training;

import java.util.Scanner;

public class esterEggsBattle_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggsFirstPlayer = Integer.parseInt(scanner.nextLine());
        int eggsSecondPlayer = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            switch (input) {
                case "one":
                    eggsSecondPlayer--;
                    break;
                case "two":
                    eggsFirstPlayer--;
                    break;
            }
            if (eggsFirstPlayer == 0 || eggsSecondPlayer == 0) {
                break;
            }

            input = scanner.nextLine();
        }

        if (eggsFirstPlayer == 0) {
            System.out.printf("Player one is out of eggs. Player two has %d eggs left.", eggsSecondPlayer);
        } else if (eggsSecondPlayer == 0) {
            System.out.printf("Player two is out of eggs. Player one has %d eggs left.", eggsFirstPlayer);
        } else {
            System.out.printf ("Player one has %d eggs left.\n",eggsFirstPlayer);
            System.out.printf ("Player two has %d eggs left.",eggsSecondPlayer);
        }
    }
}
