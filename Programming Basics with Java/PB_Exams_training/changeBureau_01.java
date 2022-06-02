package PB_Exams_training;

import java.util.Scanner;

public class changeBureau_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitcoins = Integer.parseInt(scanner.nextLine());
        double chineseYuan = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());

        //•	1 биткойн = 1168 лева.
        //•	1 китайски юан = 0.15 долара.
        //•	1 долар = 1.76 лева.
        //•	1 евро = 1.95 лева.

        double totalLev = bitcoins * 1168 + chineseYuan * 0.15 * 1.76;
        double totalEuro = (totalLev / 1.95) * (1 - commission/100.00);

        System.out.printf("%.2f", totalEuro);
    }
}
