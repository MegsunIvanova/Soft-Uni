package tema3.ConditionalStatementsAdvanced_Lab;

import java.util.Scanner;

public class cinemaTicket_08_v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Да се напише програма която чете ден от седмицата (текст) –
        // въведен от потребителя и принтира на конзолата
        // цената на билет за кино според деня от седмицата:

        String day = scanner.nextLine();

        switch (day) {
            case "Monday", "Tuesday", "Friday" -> System.out.println(12);
            case "Wednesday", "Thursday" -> System.out.println(14);
            case "Saturday", "Sunday" -> System.out.println(16);
        }
    }
}

