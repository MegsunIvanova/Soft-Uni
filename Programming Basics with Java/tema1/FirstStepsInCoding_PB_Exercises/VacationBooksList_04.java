package tema1.FirstStepsInCoding_PB_Exercises;

import java.util.Scanner;

public class VacationBooksList_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numberOfPagesCurrentBook = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int numOfDays = Integer.parseInt(scanner.nextLine());
        int hoursPerDay = (numberOfPagesCurrentBook/pagesPerHour)/numOfDays;

        System.out.println(hoursPerDay);

    }
}
