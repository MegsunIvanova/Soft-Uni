package tema3.ConditionalStatementsAdvanced_Lab;

import java.util.Scanner;


public class tradeCommissions_12_v2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double comision = 0;

        if (sales >= 0 && sales <= 500) {
            switch (town) {
                case "Sofia":
                    comision = sales * 0.05;
                    break;
                case "Varna":
                    comision = sales * 0.045;
                    break;
                case "Plovdiv":
                    comision = sales * 0.055;
                    break;
            }

        } else if (sales > 500 && sales <= 1000) {
            switch (town) {
                case "Sofia":
                    comision = sales * 0.07;
                    break;
                case "Varna":
                    comision = sales * 0.075;
                    break;
                case "Plovdiv":
                    comision = sales * 0.08;
                    break;
            }
        } else if (sales > 1000 && sales <= 10000) {
            switch (town) {
                case "Sofia":
                    comision = sales * 0.08;
                    break;
                case "Varna":
                    comision = sales * 0.10;
                    break;
                case "Plovdiv":
                    comision = sales * 0.12;
                    break;
            }
        } else if (sales > 10000) {
            switch (town) {
                case "Sofia":
                    comision = sales * 0.12;
                    break;
                case "Varna":
                    comision = sales * 0.13;
                    break;
                case "Plovdiv":
                    comision = sales * 0.145;
                    break;
            }
        }
        if (!(comision == 0.00)) {
            System.out.printf("%.2f", comision);
        } else {
            System.out.println("error");
        }
    }

}

