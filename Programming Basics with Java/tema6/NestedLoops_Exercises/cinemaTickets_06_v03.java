package tema6.NestedLoops_Exercises;

import java.util.Scanner;

public class cinemaTickets_06_v03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        int counter = 0;
        int countStudent = 0;
        int countStandard = 0;
        int countKid = 0;

        while (!movie.equals("Finish")) {
            int freeSeats = Integer.parseInt(scanner.nextLine());
            int currentCounter = 0;
            String input = scanner.nextLine();
            while (!input.equals("End")) {
                counter++;
                currentCounter++;

                switch (input) {
                    case "student":
                        countStudent++;
                        break;
                    case "standard":
                        countStandard++;
                        break;
                    case "kid":
                        countKid++;
                        break;
                }

                if (currentCounter == freeSeats) {
                    break;
                }
                input = scanner.nextLine();
            }

            System.out.printf("%s - %.2f%% full.%n", movie, currentCounter * 100.00 / freeSeats);

            movie = scanner.nextLine();
        }

        System.out.printf("Total tickets: %d%n", counter);
        System.out.printf("%.2f%% student tickets.%n", countStudent * 100.00 / counter);
        System.out.printf("%.2f%% standard tickets.%n", countStandard * 100.00 / counter);
        System.out.printf("%.2f%% kids tickets.%n", countKid * 100.00 / counter);

    }
}
