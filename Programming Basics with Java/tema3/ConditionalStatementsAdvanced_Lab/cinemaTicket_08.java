package tema3.ConditionalStatementsAdvanced_Lab;

import java.util.Scanner;

public class cinemaTicket_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Да се напише програма която чете ден от седмицата (текст) –
        // въведен от потребителя и принтира на конзолата
        // цената на билет за кино според деня от седмицата:

        String weekday = scanner.nextLine();

        if (weekday.equals("Monday") || weekday.equals("Tuesday") || weekday.equals("Friday")) {
            System.out.println(12);
        } else if (weekday.equals("Wednesday") || weekday.equals("Thursday")) {
            System.out.println(14);
        } else if (weekday.equals("Saturday") || weekday.equals("Sunday")) {
            System.out.println(16);
        }
    }
}

