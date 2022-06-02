package tema2.ConditionalStatements_MoreExercises;

import java.util.Scanner;

public class TransportPrice_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kilometers = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();
        double price = 0;

        if (kilometers < 20) {
            if (time.equals("day")) {
                price = 0.70 + kilometers * 0.79;
            } else if (time.equals("night")) {
                price = 0.70 + kilometers * 0.90;
            }
        } else if (kilometers < 100) {
            price = kilometers * 0.09;
        } else {
            price = kilometers * 0.06;
        }

        System.out.printf("%.2f", price);

    }
}
