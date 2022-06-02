package tema2.ConditionalStatements;

import java.util.Scanner;

public class PasswordGuess04 {
    public static void main(String[] args) {
        //Да се напише програма, която чете парола (текст),
        // въведена от потребителя и проверява дали
        // въведената парола съвпада с фразата
        // "s3cr3t!P@ssw0rd".
        // При съвпадение да се изведе "Welcome".
        // При несъвпадение да се изведе "Wrong password!".

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String password = "s3cr3t!P@ssw0rd";

        if (input.equals(password)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
