package tema1.FirstStepsInCoding_PB_Exercises;

import java.util.Scanner;

public class DepositCalculator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double depositAmount = Double.parseDouble(scanner.nextLine());
        int nPeriods = Integer.parseInt(scanner.nextLine());
        double rate = Double.parseDouble(scanner.nextLine())/100;
        double amountInTheEnd = depositAmount + nPeriods * ((depositAmount * rate)/12);
        System.out.println(amountInTheEnd);

    }
}
