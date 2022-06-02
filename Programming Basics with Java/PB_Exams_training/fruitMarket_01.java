package PB_Exams_training;

import java.util.Scanner;

public class fruitMarket_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double strawberriesPrice = Double.parseDouble(scanner.nextLine());
        double bananasQuantity = Double.parseDouble(scanner.nextLine());
        double orangesQuantity = Double.parseDouble(scanner.nextLine());
        double raspberriesQuantity = Double.parseDouble(scanner.nextLine());
        double strawberriesQuantity = Double.parseDouble(scanner.nextLine());

        //•	цената на малините е на половина по-ниска от тази на ягодите;
        //•	цената на портокалите е с 40% по-ниска от цената на малините;
        //•	цената на бананите е с 80% по-ниска от цената на малините.

        double raspberriesPrice = strawberriesPrice / 2;
        double orangesPrice = raspberriesPrice * 0.60;
        double bananasPrice = raspberriesPrice * 0.20;
        double total = strawberriesPrice * strawberriesQuantity + raspberriesQuantity * raspberriesPrice + orangesPrice * orangesQuantity + bananasQuantity * bananasPrice;

        System.out.printf("%.2f", total);
    }
}
