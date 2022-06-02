package PB_Exams_training;

import java.util.Scanner;

public class pCGameShop_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soldGames = Integer.parseInt(scanner.nextLine());
        int hearthstoneCounter = 0;
        int forniteCounter = 0;
        int overwatchCounter = 0;
        int othersCounter = 0;

        for (int i = 1; i <= soldGames; i++) {
            String currentGame = scanner.nextLine();
            switch (currentGame) {
                case "Hearthstone":
                    hearthstoneCounter++;
                    break;
                case "Fornite":
                    forniteCounter++;
                    break;
                case "Overwatch":
                    overwatchCounter++;
                    break;
                default:
                    othersCounter++;
                    break;
            }
        }

        System.out.printf("Hearthstone - %.2f%%\n", hearthstoneCounter * 100.0 / soldGames);
        System.out.printf("Fornite - %.2f%%\n", forniteCounter * 100.0 / soldGames);
        System.out.printf("Overwatch - %.2f%%\n", overwatchCounter * 100.0 / soldGames);
        System.out.printf("Others - %.2f%%\n", othersCounter * 100.0 / soldGames);
    }
}
