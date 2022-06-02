package PB_Exams_training;

import java.util.Scanner;

public class cinemaTickets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();

        int totalTickets = 0;
        int totalStudentTickets = 0;
        int totalStandardTickets = 0;
        int totalKidsTickets = 0;


        while (!movie.equals("Finish")) {
            int freeSeats = Integer.parseInt(scanner.nextLine());

            String ticket = scanner.nextLine();
            int ticketCounter = 0;

            while (!ticket.equals("End")) {
                ticketCounter++;
                switch (ticket) {
                    case "student":
                        totalStudentTickets++;
                        break;
                    case "standard":
                        totalStandardTickets++;
                        break;
                    case "kid":
                        totalKidsTickets++;
                        break;
                }
                if (ticketCounter == freeSeats) {
                    break;
                }
                ticket = scanner.nextLine();
            }
            totalTickets += ticketCounter;
            System.out.printf("%s - %.2f%% full.\n", movie, (ticketCounter * 100.0 / freeSeats));

            movie = scanner.nextLine();
        }

        System.out.printf("Total tickets: %d\n", totalTickets);
        System.out.printf("%.2f%% student tickets.\n", totalStudentTickets * 100.0 / totalTickets);
        System.out.printf("%.2f%% standard tickets.\n", totalStandardTickets * 100.0 / totalTickets);
        System.out.printf("%.2f%% kids tickets.", totalKidsTickets * 100.0 / totalTickets);
    }
}
