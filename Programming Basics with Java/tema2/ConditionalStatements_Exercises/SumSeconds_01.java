package tema2.ConditionalStatements_Exercises;

import java.util.Scanner;

public class SumSeconds_01 {
    public static void main(String[] args) {
        //Трима спортни състезатели финишират за някакъв брой секунди
        // (между 1 и 50). Да се напише програма, която чете времената
        // на състезателите в секунди, въведени от потребителя и
        // пресмята сумарното им време във формат "минути:секунди".
        // Секундите да се изведат с водеща нула
        // (2  "02", 7  "07", 35  "35").

        Scanner scanner = new Scanner(System.in);
        int timeFirst = Integer.parseInt(scanner.nextLine());
        int timeSecond = Integer.parseInt(scanner.nextLine());
        int timeThird = Integer.parseInt(scanner.nextLine());

        int totalTime = timeFirst + timeSecond + timeThird;

        int minutes = totalTime / 60;
        int seconds = totalTime % 60;

        if (seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);
        } else {
            System.out.printf("%d:%d", minutes, seconds);
        }
        //или без  if
        // System.out.printf("%d:%0d", minutes, seconds);
    }
}
