package tema4.ForLoop_Lab;

import java.util.Scanner;

public class numbers1toNwithStep3_03 {
    public static void main(String[] args) {
        //Напишете програма, която чете число n,
        // въведено от потребителя и отпечатва числата от 1 до n през 3
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i += 3) {
            System.out.println(i);
        }

    }
}
