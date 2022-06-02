package PB_Exams_training;

import java.util.Scanner;

public class easterEggs_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggsNumber = Integer.parseInt(scanner.nextLine());
        int redEggs = 0;
        int orangeEggs = 0;
        int blueEggs = 0;
        int greenEggs = 0;
        String maxEggsColor = "";
        int maxEggsNumber = Integer.MIN_VALUE;

        for (int i = 1; i <= eggsNumber; i++) {
            String color = scanner.nextLine();
            int currentSum = 0;
            switch (color) {
                case "red":
                    redEggs++;
                    currentSum = redEggs;
                    break;
                case "orange":
                    orangeEggs++;
                    currentSum = orangeEggs;
                    break;
                case "blue":
                    blueEggs++;
                    currentSum = blueEggs;
                    break;
                case "green":
                    greenEggs++;
                    currentSum = greenEggs;
                    break;

            }
            if (currentSum > maxEggsNumber) {
                maxEggsNumber = currentSum;
                maxEggsColor = color;
            }
        }

        System.out.printf("Red eggs: %d\n", redEggs);
        System.out.printf("Orange eggs: %d\n", orangeEggs);
        System.out.printf("Blue eggs: %d\n", blueEggs);
        System.out.printf("Green eggs: %d\n", greenEggs);
        System.out.printf("Max eggs: %d -> %s", maxEggsNumber, maxEggsColor);
    }
}
