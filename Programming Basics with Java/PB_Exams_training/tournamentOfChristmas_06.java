package PB_Exams_training;

import java.util.Scanner;

public class tournamentOfChristmas_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int winDays = 0;
        int totalWins = 0;
        int totalLoses = 0;
        double totalMoney = 0;

        for (int i = 1; i <= days; i++) {
            String game = scanner.nextLine();
            int currentWins = 0;
            int currentLoses = 0;
            int currentMoney = 0;

            while (!game.equals("Finish")) {
                String currentResult = scanner.nextLine();
                if (currentResult.equals("win")) {
                    currentWins++;
                    currentMoney += 20;
                } else {
                    currentLoses++;
                }

                game = scanner.nextLine();
            }

            if (currentWins > currentLoses) {
                currentMoney *= 1.10;
                winDays++;
            }
            totalMoney += currentMoney;
            totalWins += currentWins;
            totalLoses += currentLoses;
        }
        if (winDays > (days - winDays)) {
            totalMoney *= 1.20;
        }

        if (totalWins > totalLoses) {
            System.out.printf("You won the tournament! Total raised money: %.2f", totalMoney);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalMoney);
        }

    }
}
