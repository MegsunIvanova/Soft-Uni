package PB_Exams_training;

import java.util.Scanner;

public class favoriteMovie_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        int counter = 0;
        String bestMovie = "";
        int bestMoviePoints = Integer.MIN_VALUE;

        while (!movie.equals("STOP")) {
            int currentMoviePoints = 0;
            for (int i = 0; i < movie.length(); i++) {
                char currentChar = movie.charAt(i);
                currentMoviePoints += currentChar;
                if (currentChar >= 97 && currentChar <= 122) {
                    currentMoviePoints -= movie.length() * 2;
                } else if (currentChar >= 65 && currentChar <= 90) {
                    currentMoviePoints -= movie.length();
                }
            }
            if (currentMoviePoints > bestMoviePoints) {
                bestMoviePoints = currentMoviePoints;
                bestMovie = movie;
            }

            counter++;
            if (counter == 7) {
                System.out.println("The limit is reached.");
                break;
            }
            movie = scanner.nextLine();
        }
        System.out.printf("The best movie for you is %s with %d ASCII sum.", bestMovie, bestMoviePoints);
    }
}
