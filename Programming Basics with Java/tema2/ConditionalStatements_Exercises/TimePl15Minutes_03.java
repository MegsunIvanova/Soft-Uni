package tema2.ConditionalStatements_Exercises;

import java.util.Scanner;

public class TimePl15Minutes_03 {
    public static void main(String[] args) {
        //Да се напише програма, която чете час и минути от 24-часово денонощие,
        // въведени от потребителя и изчислява колко ще е часът след 15 минути.
        // Резултатът да се отпечата във формат часове:минути.
        // Часовете винаги са между 0 и 23, а минутите винаги са между 0 и 59.
        // Часовете се изписват с една или две цифри.
        // Минутите се изписват винаги с по две цифри, с водеща нула,
        // когато е необходимо.

        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        if (minutes >= 45) {
            hour = hour + 1;
        }

        if (hour == 24) {
            hour = 0;
        }

        if (minutes + 15 == 60) {
            minutes = 0;

        } else if (minutes + 15 > 60) {
            minutes = minutes + 15 - 60;
        } else {
            minutes = minutes + 15;
        }

        if (minutes < 10) {
            System.out.printf("%d:0%d",hour,minutes);
        } else {
            System.out.printf("%d:%d",hour,minutes);
        }
    }
}

