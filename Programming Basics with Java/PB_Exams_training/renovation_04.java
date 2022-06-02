package PB_Exams_training;

import java.util.Scanner;

public class renovation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());
        int allArea = height * width * 4;
        allArea -= allArea * percent / 100;

        String input = scanner.nextLine();

        while (!input.equals("Tired!")) {
            double paint = Double.parseDouble(input);
            allArea -= paint;

            if (allArea <= 0) {
                break;
            }

            input = scanner.nextLine();

        }

        if (allArea > 0) {
            System.out.printf("%d quadratic m left.", allArea);
        } else if (allArea < 0) {
            System.out.printf("All walls are painted and you have %d l paint left!", -allArea);
        } else {
            System.out.println("All walls are painted! Great job, Pesho!");
        }
    }
}
