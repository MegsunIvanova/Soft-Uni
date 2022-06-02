package PB_Exams_training;

import java.util.Scanner;

public class easterBakery_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double flourPrice = Double.parseDouble(scanner.nextLine());
        double kgFlour = Double.parseDouble(scanner.nextLine());
        double kgSugar = Double.parseDouble(scanner.nextLine());
        int numberEggBoxes = Integer.parseInt(scanner.nextLine());
        int packagesYeast = Integer.parseInt(scanner.nextLine());

        //Нужните продукти са: брашно, захар, яйца и мая
        double sumFlour = kgFlour * flourPrice;
        //•	цената на килограм захар е с 25% по-ниска от тази на килограм брашно
        double sumSugar = kgSugar * (flourPrice * 0.75);
        //•	цената на една кора с яйца е с 10% по-висока от цената на килограм брашно
        double sumEggs = numberEggBoxes * (flourPrice * 1.10);
        //•	цената на един пакет мая е с 80% по-ниска от цената на килограм захар
        double sumYeast = packagesYeast * ((flourPrice * 0.75) * 0.20);

        double total = sumFlour + sumSugar + sumEggs + sumYeast;

        System.out.printf("%.2f", total);
    }
}
