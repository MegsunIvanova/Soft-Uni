package tema5.WhileLoop_Lab_;

import java.util.Scanner;

public class readText_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Напишете програма, която чете текст от конзолата (стринг) и
        // го принтира, докато не получи командата "Stop".

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Stop")) {
                break;
            }
            System.out.println(input);
        }
    }
}
