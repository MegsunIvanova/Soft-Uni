package tema1.FirstStepsInCoding_PB_MoreExercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CircleAreaAndPerimeter_08 {
    public static void main(String[] args) {
        //Напишете програма, която чете от конзолата число r
        // и пресмята и отпечатва лицето и периметъра на кръг / окръжност с радиус r,
        // като форматирате изхода в следния вид: "<calculated area>"
        //"<calculated parameter>".
        // Форматирайте изходните данни до втория знак след десетичната запетая.

        Scanner scanner = new Scanner(System.in);
        double r = Double.parseDouble(scanner.nextLine());
        double area = Math.PI * r * r;
        double perimeter = 2 * Math.PI * r;

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println(df.format(area));
        System.out.println(df.format(perimeter));


    }
}
