package tema3.ConditionalStatementsAdvanced_Exercises;

import java.util.Scanner;

public class onTimeForTheExam_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinute = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinute = Integer.parseInt(scanner.nextLine());

        int difference = (examHour * 60 + examMinute) - (arrivalHour * 60 + arrivalMinute);
        String beforeAfter = "";

        if (difference >= 0 && difference <= 30) {
            System.out.println("On time");
            beforeAfter = "before";
        } else if (difference > 30) {
            System.out.println("Early");
            beforeAfter = "before";
        } else if (difference < 0) {
            System.out.println("Late");
            beforeAfter = "after";
        }

        if (Math.abs(difference) > 0 && Math.abs(difference) < 60) {
            System.out.printf("%d minutes %s the start", Math.abs(difference), beforeAfter);
        } else if (Math.abs(difference) >= 60) {
            int minutesDifference = (Math.abs(difference) % 60);
            int hoursDifference = (Math.abs(difference) - minutesDifference) / 60;
            if (minutesDifference < 10) {
                System.out.printf("%d:0%d hours %s the start", hoursDifference, minutesDifference, beforeAfter);
            } else {
                System.out.printf("%d:%d hours %s the start", hoursDifference, minutesDifference, beforeAfter);
            }

        }
    }
}
