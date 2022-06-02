package tema4.ForLoop_Lab;

import java.util.Scanner;

public class vowelsSum_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Да се напише програма, която чете текст (стринг), въведен от потребителя,
        // изчислява и отпечатва сумата от стойностите на гласните букви
        // според таблицата по-долу:
        //буква 	a	e	i	o	u
        //стойност	1	2	3	4	5

        String text = scanner.nextLine();
        int result = 0;

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            switch (symbol) {
                case 'a':
                    result += 1;
                    break;
                case 'e':
                    result += 2;
                    break;
                case 'i':
                    result += 3;
                    break;
                case 'o':
                    result += 4;
                    break;
                case 'u':
                    result += 5;
                    break;
            }
        }

        System.out.println(result);

    }
}
