package tema4.ForLoop_MoreExerxises;

import java.util.Scanner;

public class bills_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int months = Integer.parseInt(scanner.nextLine());
        double totalElectricity = 0;
        double totalWater = 20*months;
        double totalInternet = 15*months;
        double totalOther = 0;

        for (int i = 1; i <= months; i++) {
            double electricity = Double.parseDouble(scanner.nextLine());
            totalElectricity +=  electricity;
            totalOther += (electricity+20+15)*1.20;
        }
        double averageBills = (totalElectricity+totalWater+totalInternet+totalOther)/months;

        System.out.printf("Electricity: %.2f lv%n",totalElectricity);
        System.out.printf("Water: %.2f lv%n",totalWater);
        System.out.printf("Internet: %.2f lv%n",totalInternet);
        System.out.printf("Other: %.2f lv%n",totalOther);
        System.out.printf("Average: %.2f lv%n",averageBills);
    }
}
