package PB_Exam;

import java.util.Scanner;

public class santasHoliday_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	"room for one person" – 18.00 лв за нощувка
        //•	"apartment" – 25.00 лв за нощувка
        //•	"president apartment" – 35.00 лв за нощувка
        // има намаление в зависимост от блоя на нощувките (табл.)
        //След престоя
        // Ако оценката му е позитивна, към цената с вече приспаднатото намаление
        // Дядо Коледа добавя 25%  към нея.
        // Ако оценката му е негативна приспада от цената 10%.

        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String rating = scanner.nextLine();
        int nights = days - 1;
        double totalPrice = 0;

        switch (roomType) {
            case "room for one person":
                totalPrice = nights * 18;
                break;
            case "apartment":
                totalPrice = nights * 25;
                if (days > 15) {
                    totalPrice *= 0.50;
                } else if (days >= 10) {
                    totalPrice *= 0.65;
                } else {
                    totalPrice *= 0.70;
                }
                break;
            case "president apartment":
                totalPrice = nights * 35;
                if (days > 15) {
                    totalPrice *= 0.80;
                } else if (days >= 10) {
                    totalPrice *= 0.85;
                } else {
                    totalPrice *= 0.90;
                }
                break;
        }

        if (rating.equals("positive")) {
            totalPrice *= 1.25;
        } else if (rating.equals("negative")) {
            totalPrice *= 0.90;
        }

        System.out.printf("%.2f", totalPrice);
    }
}
