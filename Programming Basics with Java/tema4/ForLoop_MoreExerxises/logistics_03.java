package tema4.ForLoop_MoreExerxises;

import java.util.Scanner;

public class logistics_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int minibusTotalTonnage = 0;
        int truckTotalTonnage = 0;
        int trainTotalTonnage = 0;
        int totalPrice = 0;

        for (int i = 1; i <= number; i++) {
            int tonnage = Integer.parseInt(scanner.nextLine());
            if (tonnage <= 3) {
                minibusTotalTonnage += tonnage;
                totalPrice += 200 * tonnage;
            } else if (tonnage <= 11) {
                truckTotalTonnage += tonnage;
                totalPrice += 175 * tonnage;
            } else {
                trainTotalTonnage += tonnage;
                totalPrice += 120 * tonnage;
            }
        }
        int totalTonnage = minibusTotalTonnage + truckTotalTonnage + trainTotalTonnage;
        double averagePrice = totalPrice*1.00 / totalTonnage;
        double minibusPercentage = (minibusTotalTonnage * 1.00 / totalTonnage) * 100;
        double truckPercentage = (truckTotalTonnage * 1.00 / totalTonnage) * 100;
        double trainPercentage = (trainTotalTonnage * 1.00 / totalTonnage) * 100;

        //•	Първи ред – средната цена на тон превозен товар
        // (закръглена до втория знак след дес. запетая)
        System.out.printf("%.2f%n", averagePrice);

        //•	Втори ред – процентът тона превозвани с микробус
        // (процент между 0.00% и 100.00%);
        System.out.printf("%.2f%%%n", minibusPercentage);

        //•	Трети ред – процентът  тона превозвани с камион
        System.out.printf("%.2f%%%n", truckPercentage);

        //•	Четвърти ред – процентът тона превозвани с влак
        System.out.printf("%.2f%%%n", trainPercentage);


    }
}
