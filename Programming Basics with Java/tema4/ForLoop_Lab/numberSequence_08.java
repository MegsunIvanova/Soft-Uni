package tema4.ForLoop_Lab;

import java.util.Scanner;

public class numberSequence_08 {
    public static void main(String[] args) {
        //Напишете програма, която чете n на брой цели числа.
        // Принтирайте най-голямото и най-малкото число сред въведените.
        Scanner scanner = new Scanner(System.in);
        int smallest = Integer.MAX_VALUE;
        int biggest = Integer.MIN_VALUE;
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num > biggest) {
                biggest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }

        System.out.printf("Max number: %d%n", biggest);
        System.out.printf("Min number: %d", smallest);

    }
}
