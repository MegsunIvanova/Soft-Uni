package PB_Exams_training;

import java.util.Scanner;

public class balls_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double totalPoints = 0;
        int countRed = 0;
        int countOrange = 0;
        int countYellow = 0;
        int countWhite = 0;
        int countBlack = 0;
        int countOthers = 0;


        for (int i = 1; i <= n; i++) {
            String color = scanner.nextLine();
            switch (color) {
                case "red":
                    totalPoints += 5;
                    countRed++;
                    break;
                case "orange":
                    totalPoints += 10;
                    countOrange++;
                    break;
                case "yellow":
                    totalPoints += 15;
                    countYellow++;
                    break;
                case "white":
                    totalPoints += 20;
                    countWhite++;
                    break;
                case "black":
                    totalPoints = Math.floor(totalPoints / 2);
                    countBlack++;
                    break;
                default:
                    countOthers++;
                    break;
            }
        }

        System.out.printf("Total points: %.0f\n", totalPoints);
        System.out.printf("Red balls: %d\n", countRed);
        System.out.printf("Orange balls: %d\n", countOrange);
        System.out.printf("Yellow balls: %d\n", countYellow);
        System.out.printf("White balls: %d\n", countWhite);
        System.out.printf("Other colors picked: %d\n", countOthers);
        System.out.printf("Divides from black balls: %d\n", countBlack);
    }
}
