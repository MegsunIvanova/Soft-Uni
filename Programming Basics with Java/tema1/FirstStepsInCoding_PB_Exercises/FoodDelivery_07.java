package tema1.FirstStepsInCoding_PB_Exercises;

import java.util.Scanner;

public class FoodDelivery_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfChickenMenus = Integer.parseInt(scanner.nextLine());
        int numberOfFishMenus = Integer.parseInt(scanner.nextLine());
        int numberOfVegetarianMenus = Integer.parseInt(scanner.nextLine());
        double totalMenusPrice = numberOfChickenMenus * 10.35 + numberOfFishMenus * 12.40 + numberOfVegetarianMenus * 8.15;
        double dessertPrice = totalMenusPrice*0.2;
        double totalOrderPrice = totalMenusPrice+dessertPrice+2.5;
        System.out.println(totalOrderPrice);
    }
}
