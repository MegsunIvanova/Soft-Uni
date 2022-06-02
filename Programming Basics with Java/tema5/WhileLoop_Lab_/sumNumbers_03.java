package tema5.WhileLoop_Lab_;

import java.util.Scanner;

public class sumNumbers_03 {
    public static void main(String[] args) {

        //Напишете програма, която чете цяло число от конзолата и
        // на всеки следващ ред цели числа, докато тяхната сума
        // стане по-голяма или равна на първоначалното число.
        // След приключване на четенето да се отпечата сумата на въведените числа.
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (sum < n) {
            int num = Integer.parseInt(scanner.nextLine());
            sum += num;
        }

        System.out.println(sum);
    }
}
