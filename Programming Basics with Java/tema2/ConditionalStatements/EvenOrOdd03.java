package tema2.ConditionalStatements;

import java.util.Scanner;

public class EvenOrOdd03 {
    public static void main(String[] args) {
        //Да се напише програма, която чете цяло число,
        // въведено от потребителя и
        // печата дали е четно или нечетно.
        //Ако е четно отпечатайте "even", ако е нечетно "odd".

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        if (number % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

    }
}
