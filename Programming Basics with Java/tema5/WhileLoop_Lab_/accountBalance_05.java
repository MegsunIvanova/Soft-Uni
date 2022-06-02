package tema5.WhileLoop_Lab_;

import java.util.Scanner;

public class accountBalance_05 {
    public static void main(String[] args) {
//Напишете програма, която пресмята колко общо пари има в сметката,
// след като направите определен брой вноски.
// На всеки ред ще получавате сумата, която трябва да внесете в сметката,
// до получаване на команда  "NoMoreMoney ".
// При всяка получена сума на конзолата трябва да се извежда
// "Increase: " + сумата и тя да се прибавя в сметката.
// Ако получите число по-малко от 0 на конзолата трябва да се изведе
// "Invalid operation!"  и програмата да приключи.
// Когато програмата приключи трябва да се принтира
// "Total: " + общата сума в сметката форматирана до втория знак след десетичната запетая.

        Scanner scanner = new Scanner(System.in);
        double total = 0;

        double instalment = 0;


        while (instalment >= 0) {
            String input = scanner.nextLine();

            if (input.equals("NoMoreMoney")) {
                break;
            } else if (Double.parseDouble(input) < 0) {
                System.out.println("Invalid operation!");
                break;
            } else {
                instalment = Double.parseDouble(input);
                total += instalment;
                System.out.printf("Increase: %.2f%n", instalment);
            }
        }

        System.out.printf("Total: %.2f", total);


    }
}
