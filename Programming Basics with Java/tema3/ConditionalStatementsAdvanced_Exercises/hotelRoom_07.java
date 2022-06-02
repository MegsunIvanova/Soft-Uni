package tema3.ConditionalStatementsAdvanced_Exercises;

import java.util.Scanner;

public class hotelRoom_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());
        double studioPrice = 0;
        double apartmentPrice = 0;

        switch (month) {
            case "May":
            case "October":
                studioPrice = 50*number;
                apartmentPrice = 65*number;
                if (number > 14) {
                    studioPrice = studioPrice * 0.70;
                    apartmentPrice = apartmentPrice * 0.90;
                } else if (number > 7) {
                    studioPrice = studioPrice * 0.95;
                }
                break;
            case "June":
            case "September":
                studioPrice = 75.20*number;
                apartmentPrice = 68.70*number;
                if (number > 14) {
                    studioPrice = studioPrice * 0.80;
                    apartmentPrice = apartmentPrice * 0.90;
                }
                break;
            case "July":
            case "August":
                studioPrice = 76*number;
                apartmentPrice = 77*number;
                if (number > 14) {
                    apartmentPrice = apartmentPrice * 0.90;
                }
        }
        System.out.printf("Apartment: %.2f lv.%n", apartmentPrice);
        System.out.printf("Studio: %.2f lv.%n", studioPrice);
    }
}

