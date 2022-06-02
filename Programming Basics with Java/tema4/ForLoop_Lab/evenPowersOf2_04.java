package tema4.ForLoop_Lab;

import java.util.Scanner;

public class evenPowersOf2_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Да се напише програма, която чете число n, въведено от потребителя и
        // печата четните степени на 2 ≤ 2n: 20, 22, 24, 26, …, 2n.
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= n; i += 2) {

            System.out.printf("%.0f%n", Math.pow(2, i));

        }
    }
}
