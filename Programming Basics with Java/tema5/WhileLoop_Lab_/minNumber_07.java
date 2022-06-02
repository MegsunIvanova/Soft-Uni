package tema5.WhileLoop_Lab_;

import java.util.Scanner;

public class minNumber_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int minNum = Integer.MAX_VALUE;

        while (!input.equals("Stop")) {
            if (Integer.parseInt(input) < minNum) {
                minNum = Integer.parseInt(input);
            }
            input = scanner.nextLine();
        }
        System.out.println(minNum);
    }
}
