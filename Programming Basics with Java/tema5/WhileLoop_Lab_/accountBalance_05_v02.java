package tema5.WhileLoop_Lab_;

import java.util.Scanner;

public class accountBalance_05_v02 {
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
        String input = scanner.nextLine();
        double balance = 0;

        while (!input.equals("NoMoreMoney")) {
            double instalment = Double.parseDouble(input);
            if (instalment < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            balance += instalment;
            System.out.printf("Increase: %.2f%n", instalment);

            input = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", balance);
    }
}

