package PB_Exams_training;

import java.util.Scanner;

public class fitnessCenter_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int clients = Integer.parseInt(scanner.nextLine());
        int backCounter = 0;
        int chestCounter = 0;
        int legsCounter = 0;
        int absCounter = 0;
        int shakeCounter = 0;
        int barCounter = 0;

        for (int i = 1; i <= clients; i++) {
            String activity = scanner.nextLine();
            switch (activity) {
                case "Back":
                    backCounter++;
                    break;
                case "Chest":
                    chestCounter++;
                    break;
                case "Legs":
                    legsCounter++;
                    break;
                case "Abs":
                    absCounter++;
                    break;
                case "Protein shake":
                    shakeCounter++;
                    break;
                case "Protein bar":
                    barCounter++;
                    break;
            }
        }
        double percentWorkOut = (backCounter + chestCounter + legsCounter + absCounter) * 100.0 / clients;
        double percentProtein = (shakeCounter + barCounter) * 100.0 / clients;

        System.out.printf("%d - back\n", backCounter);
        System.out.printf("%d - chest\n", chestCounter);
        System.out.printf("%d - legs\n", legsCounter);
        System.out.printf("%d - abs\n", absCounter);
        System.out.printf("%d - protein shake\n", shakeCounter);
        System.out.printf("%d - protein bar\n", barCounter);
        System.out.printf("%.2f%% - work out\n", percentWorkOut);
        System.out.printf("%.2f%% - protein\n", percentProtein);

    }
}
