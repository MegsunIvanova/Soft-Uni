package tema1.FirstStepsInCoding_PB_MoreExercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CelsiusToFahrenheit_03 {
    public static void main(String[] args) {

        //Напишете програма, която чете градуси по скалата на Целзий (°C) и
        // ги преобразува до градуси по скалата на Фаренхайт (°F).
        // Потърсете в Интернет подходяща формула,
        // с която да извършите изчисленията.
        // Форматирате изхода до втория знак след десетичната запетая.

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double celsius = Double.parseDouble (scanner.nextLine());
        double fahrenheit = celsius*1.8+32;

        System.out.println(df.format(fahrenheit));

    }
}
