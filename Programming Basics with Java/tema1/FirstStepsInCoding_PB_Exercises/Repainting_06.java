package tema1.FirstStepsInCoding_PB_Exercises;

import java.util.Scanner;

public class Repainting_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nylonSqM = Integer.parseInt (scanner.nextLine());
        int painLiters = Integer.parseInt (scanner.nextLine());
        int thinnerLiters = Integer.parseInt (scanner.nextLine());
        int WorkingHours = Integer.parseInt (scanner.nextLine());

        double materialsAmount = (nylonSqM+2)*1.5+(painLiters*1.10)*14.50+thinnerLiters*5+0.40;
        double workAmount =materialsAmount*0.30*WorkingHours;
        double totalAmount = materialsAmount+workAmount;


        System.out.println(totalAmount);

    }
}
