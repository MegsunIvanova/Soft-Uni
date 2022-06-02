package PB_Exams_training;

import java.util.Scanner;

public class suitcasesLoad_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double capacity = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        int counter = 0;

        while (!input.equals("End")) {
            counter++;
            double currentSuitcase = Double.parseDouble(input);
            if (counter % 3 == 0) {
                currentSuitcase *= 1.10;
            }

            if (capacity < currentSuitcase) {
                System.out.println("No more space!");
                counter--;
                break;
            }
            capacity -= currentSuitcase;
            input = scanner.nextLine();
        }

        if (input.equals("End")) {
            System.out.println("Congratulations! All suitcases are loaded!");
        }

        System.out.printf("Statistic: %d suitcases loaded.", counter);
    }
}
