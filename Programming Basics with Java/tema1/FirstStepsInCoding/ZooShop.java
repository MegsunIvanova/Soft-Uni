package tema1.FirstStepsInCoding;

import java.util.Scanner;

public class ZooShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        //Напишете програма, която пресмята нужните разходи за закупуването на храна
        // за кучета и котки.
        // Храната се пазарува от зоомагазин,
        // като една опаковка храна за кучета е на цена 2.50 лв,
        // а опаковка храна за котки струва 4 лв.


        //От конзолата се четат 2 реда:
        //1.	Броят на опаковките храна за кучета – цяло число в интервала [0… 100]
        //2.	Броят на опаковките храна за котки –  цяло число в интервала [0… 100]

        //На конзолата се отпечатва:
        //"{крайната сума} lv."

        int dogsPackages = Integer.parseInt(scanner.nextLine ());
        int catsPackages = Integer.parseInt(scanner.nextLine ());

        double dogsTotalPrice = dogsPackages*2.50;
        double catsTotalPrice = catsPackages*4;
        double totalExpenses = dogsTotalPrice+catsTotalPrice;

        System.out.printf("%f lv.", totalExpenses);
    }
}
