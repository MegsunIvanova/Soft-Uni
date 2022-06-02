package tema5.WhileLoop_Lab_;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("Stop")) {
            System.out.println("Infinite loop");
            input = scanner.nextLine();
        }


    }
}
