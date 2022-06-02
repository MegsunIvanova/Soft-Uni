package tema1.FirstStepsInCoding_PB_MoreExercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TriangleArea_02 {
    public static void main(String[] args) {

        //Напишете програма, която чете от конзолата
        // страна и височина на триъгълник и пресмята неговото лице.
        // Използвайте формулата за лице на триъгълник: area = a * h / 2.
        // Форматирате изхода до втория знак след десетичната запетая.
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double trSide = Double.parseDouble(scanner.nextLine());
        double trheight = Double.parseDouble(scanner.nextLine());
        double trface = trSide * trheight /2;

        System.out.println(df.format(trface));

    }
}
