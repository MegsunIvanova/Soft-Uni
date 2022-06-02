package tema1.FirstStepsInCoding_PB_MoreExercises;

import java.util.Scanner;

public class WeatherForecastPart2_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Напишете програма, която при въведени градуси (реално число) принтира какво е времето, като имате предвид следната таблица:
        //Градуси	Време
        //26.00 - 35.00	Hot
        //20.1 - 25.9	Warm
        //15.00 - 20.00	Mild
        //12.00 - 14.9	Cool
        //5.00 - 11.9	Cold
        //Ако се въведат градуси, различни от посочените в таблицата, да се отпечата "unknown".

        double degrees = Double.parseDouble(scanner.nextLine());

        if (degrees > 35) {
            System.out.println("unknown");
        } else {
            if (degrees >= 26) {
                System.out.println("Hot");
            } else {
                if (degrees >= 20.1) {
                    System.out.println("Warm");
                } else {
                    if (degrees >= 15) {
                        System.out.println("Mild");
                    } else {
                        if (degrees >= 12) {
                            System.out.println("Cool");
                        } else {
                            if (degrees >= 5) {
                                System.out.println("Cold");
                            } else {
                                System.out.println("unknown");
                            }
                        }
                    }
                }
            }
        }
    }
}


