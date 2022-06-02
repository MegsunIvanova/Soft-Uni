package PB_Exams_training;

import java.util.Scanner;

public class easterLunch_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int easterCakes = Integer.parseInt(scanner.nextLine());
        int eggs = Integer.parseInt(scanner.nextLine()) * 12;
        int cookies = Integer.parseInt(scanner.nextLine());

        double easterCakesSum = easterCakes * 3.20;
        double eggsSum = (eggs / 12.0) * 4.35;
        double cookiesSum = cookies * 5.40;
        double eggDieSum = eggs * 0.15;

        double sum = easterCakesSum + eggsSum + cookiesSum + eggDieSum;

        System.out.printf("%.2f", sum);
    }
}
