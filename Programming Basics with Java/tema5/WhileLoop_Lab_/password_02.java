package tema5.WhileLoop_Lab_;

import java.util.Scanner;

public class password_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Напишете програма, която първоначално прочита име и парола
        // на потребителски профил. След това чете парола за вход.
        //•	при въвеждане на грешна парола:
        // потребителя да се подкани да въведе нова парола.
        //•	при въвеждане на правилна парола:
        // отпечатваме "Welcome {username}!".

        String username = scanner.nextLine();
        String password = scanner.nextLine();

        String input = scanner.nextLine();
        while (!input.equals(password)) {
            input = scanner.nextLine();
        }
        System.out.println("Welcome " + username + "!");
    }
}
