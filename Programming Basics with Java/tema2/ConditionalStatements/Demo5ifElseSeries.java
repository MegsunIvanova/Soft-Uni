package tema2.ConditionalStatements;

import java.util.Scanner;

public class Demo5ifElseSeries {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();

        if (day.equals("Monday")) {
            System.out.println("Monday");
        } else if (day.equals("Tuesday")) {
            System.out.println("Tuesday");
        } else if (day.equals("Wednesday")) {
            System.out.println("Wednesday");
            //....
        } else {
            System.out.println("Unknown");
        }
    }
}
