package PB_Exam;

import java.util.Scanner;

public class footballKit_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tShirtPrice = Double.parseDouble(scanner.nextLine());
        double ballAmount = Double.parseDouble(scanner.nextLine());

        double shortsPrice = tShirtPrice * 0.75;
        double socksPrice = shortsPrice * 0.20;
        double buttonsPrice = (tShirtPrice + shortsPrice) * 2;
        double totalBill = (tShirtPrice + shortsPrice + socksPrice + buttonsPrice) * 0.85;

        if (totalBill >= ballAmount) {
            System.out.println("Yes, he will earn the world-cup replica ball!");
            System.out.printf("His sum is %.2f lv.", totalBill);
        } else {
            System.out.println("No, he will not earn the world-cup replica ball.");
            System.out.printf("He needs %.2f lv. more.", ballAmount - totalBill);
        }


    }
}
