package tema4.ForLoop_Lab;

import java.util.Scanner;

public class sumNumbers_07 {
    public static void main(String[] args) {
        //Да се напише програма, която чете n-на брой цели числа,
        // въведени от потребителя и ги сумира.
        //•	От първия ред на входа се въвежда броят числа n.
        //•	От следващите n реда се въвежда по едно цяло число.
        //Програмата трябва да прочете числата,
        // да ги сумира и да отпечата сумата им.

        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= input; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum = sum + number;
        }

        System.out.println(sum);
    }
}
