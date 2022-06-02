package tema4.ForLoop_Lab;

import java.util.Scanner;

public class characterSequence_05 {
    public static void main(String[] args) {
        //Напишете програма, която чете текст (стринг), въведен от потребителя
        // и печата всеки символ от текста на отделен ред.

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int length = text.length();

        for (int i = 0; i <= length-1; i++) {

            System.out.println(text.charAt(i));
        }
    }
}
