package PB_Exams_training;

import java.util.Scanner;

public class easterTrip_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        String dates = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double sum = 0;

        switch (destination) {
            case "France":
                switch (dates) {
                    case "21-23":
                        sum = nights * 30.0;
                        break;
                    case "24-27":
                        sum = nights * 35.0;
                        break;
                    case "28-31":
                        sum = nights * 40.0;
                        break;
                }
                break;
            case "Italy":
                switch (dates) {
                    case "21-23":
                        sum = nights * 28.0;
                        break;
                    case "24-27":
                        sum = nights * 32.0;
                        break;
                    case "28-31":
                        sum = nights * 39.0;
                        break;
                }
                break;
            case "Germany":
                switch (dates) {
                    case "21-23":
                        sum = nights * 32.0;
                        break;
                    case "24-27":
                        sum = nights * 37.0;
                        break;
                    case "28-31":
                        sum = nights * 43.0;
                        break;
                }
                break;
        }
        System.out.printf("Easter trip to %s : %.2f leva.", destination, sum);
    }
}
