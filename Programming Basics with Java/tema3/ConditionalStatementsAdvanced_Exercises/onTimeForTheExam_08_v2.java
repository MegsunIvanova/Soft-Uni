package tema3.ConditionalStatementsAdvanced_Exercises;

import java.util.Scanner;

public class onTimeForTheExam_08_v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMin = Integer.parseInt(scanner.nextLine());
        int hourOfArrival = Integer.parseInt(scanner.nextLine());
        int minOfArrival = Integer.parseInt(scanner.nextLine());

        int examAllMin = examHour * 60 + examMin;
        int arriveAllMin = hourOfArrival * 60 + minOfArrival;

        int diff = Math.abs(examAllMin - arriveAllMin);
        int diffHour = diff / 60;
        int diffMin = diff % 60;

        if (examAllMin < arriveAllMin) {
            System.out.println("Late");
            if (diffHour == 0) {
                System.out.printf("%d minutes after the start", diff);
            } else {
                System.out.printf("%d:%d hours after the start", diffHour, diffMin);
            }
        } else if (examAllMin == arriveAllMin || (diff <= 30 && arriveAllMin < examAllMin)) {
            System.out.println("On time");
            if (diff != 0) {
                System.out.printf("%d minutes before the start", diff);
            }
        } else if (diff > 30 && arriveAllMin < examAllMin) {
            System.out.println("Early");
            if (diffHour == 0) {
                System.out.printf("%d minutes before the start", diff);
            } else {
                System.out.printf("%d:%d hours before the start", diffHour, diffMin);
            }
        }


    }
}
