package tema1.FirstStepsInCoding;

import java.util.Scanner;

public class GreeningYards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
    //Цената на един кв. м. е 7.61 лв със ДДС.
    // фирмата изпълнител предлага 18% отстъпка от крайната цена.
        //1.	Кв. метри, които ще бъдат озеленени

        double area= Double.parseDouble(scanner.nextLine());
        double priceWithoutDiscount = area*7.61;
        double discount= priceWithoutDiscount * 0.18;
        double priceWithDiscount = priceWithoutDiscount-discount;

        System.out.printf("The final price is: %f lv.%n",priceWithDiscount);
        System.out.printf("The discount is: %f lv.",discount);
    }
}
