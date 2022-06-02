package tema1.FirstStepsInCoding_PB_MoreExercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class VegetableMarket04 {
    public static void main(String[] args) {
        //Градинар продавал реколтата от градината си на зеленчуковата борса.
        // Продава зеленчуци за N лева на килограм и
        // плодове за M лева за килограм.
        // Напишете програма, която да пресмята приходите от реколтата в евро
        // ( ако приемем, че едно евро е равно на 1.94лв).

        //От конзолата се четат 4 числа, по едно на ред:
        //•	Първи ред – Цена за килограм зеленчуци – реално число[0.00… 1000.00]
        //•	Втори ред – Цена за килограм плодове – реално число[0.00… 1000.00]
        //•	Трети ред – Общо килограми на зеленчуците – цяло число[0… 1000]
        //•	Четвърти ред – Общо килограми на плодовете – цяло число[0… 1000]

        //Да се отпечата на конзолата едно число:
        // приходите от всички плодове и зеленчуци в евро.
        //Резултата да се форматира до втория знак след десетичния разделител.

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double vegetablesPrice = Double.parseDouble(scanner.nextLine());
        double fruitsPrice = Double.parseDouble(scanner.nextLine());
        double totalKgVegetables = Double.parseDouble(scanner.nextLine());
        double totalKgFruits = Double.parseDouble(scanner.nextLine());

        double totalIncome = vegetablesPrice*totalKgVegetables + fruitsPrice*totalKgFruits;
        double totalIncomeInEuro = totalIncome/1.94;

        System.out.println(df.format(totalIncomeInEuro));


    }
}
