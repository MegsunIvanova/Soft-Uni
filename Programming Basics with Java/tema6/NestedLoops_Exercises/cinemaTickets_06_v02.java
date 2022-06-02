package tema6.NestedLoops_Exercises;

import java.util.Scanner;

public class cinemaTickets_06_v02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        int totalTickets = 0;
        int studentTicketsCounter = 0;
        int standardTicketsCounter = 0;
        int kidsTicketsCounter = 0;
        String typeOfTicket = "";

        while (!movie.equals("Finish")) {
            int seats = Integer.parseInt(scanner.nextLine());
            int ticketsCounter;

            for (ticketsCounter = 0; ticketsCounter < seats; ticketsCounter++) {
                typeOfTicket = scanner.nextLine();
                if (typeOfTicket.equals("End")) {
                    break;
                }
                switch (typeOfTicket) {
                    case "student":
                        studentTicketsCounter++;
                        break;
                    case "standard":
                        standardTicketsCounter++;
                        break;
                    case "kid":
                        kidsTicketsCounter++;
                        break;
                }
            }

            totalTickets += ticketsCounter;

            double percentFullness = ticketsCounter * 100.00 / seats;
            System.out.printf("%s - %.2f%% full.%n", movie, percentFullness);

            movie = scanner.nextLine();
        }
//o	"Total tickets: {общият брой закупени билети за всички филми}"
//o	"{процент на студентските билети}% student tickets."
//o	"{процент на стандартните билети}% standard tickets."
//o	"{процент на детските билети}% kids tickets."

        double studentTicketsPercentage = studentTicketsCounter * 100.00 / totalTickets;
        double standardTicketsPercentage = standardTicketsCounter * 100.00 / totalTickets;
        double kidsTicketsPercentage = kidsTicketsCounter * 100.00 / totalTickets;
        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", studentTicketsPercentage);
        System.out.printf("%.2f%% standard tickets.%n", standardTicketsPercentage);
        System.out.printf("%.2f%% kids tickets.%n", kidsTicketsPercentage);

    }
}
