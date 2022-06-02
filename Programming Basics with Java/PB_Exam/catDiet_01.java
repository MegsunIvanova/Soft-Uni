package PB_Exam;

import java.util.Scanner;

public class catDiet_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int percentFat = Integer.parseInt(scanner.nextLine());
        int percentProteins = Integer.parseInt(scanner.nextLine());
        int percentCarbohydrates = Integer.parseInt(scanner.nextLine());
        int totalCalories = Integer.parseInt(scanner.nextLine());
        int percentWater = Integer.parseInt(scanner.nextLine());

        double fatTotalGrams = (totalCalories * percentFat / 100.0) / 9;
        double proteinsTotalGrams = (totalCalories * percentProteins / 100.0) / 4;
        double carbohydratesTotalGrams = (totalCalories * percentCarbohydrates / 100.0) / 4;

        double foodWeight = fatTotalGrams + proteinsTotalGrams + carbohydratesTotalGrams;

        double caloriesPerGramFood = totalCalories / foodWeight;
        double caloriesPerGramWithoutWater = caloriesPerGramFood * (1 - percentWater / 100.0);

        System.out.printf("%.4f", caloriesPerGramWithoutWater);

    }
}
