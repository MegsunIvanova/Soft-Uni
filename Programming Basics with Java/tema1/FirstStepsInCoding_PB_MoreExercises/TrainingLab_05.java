package tema1.FirstStepsInCoding_PB_MoreExercises;

import java.util.Scanner;

public class TrainingLab_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double w = Double.parseDouble(scanner.nextLine())*100;
        double h = Double.parseDouble(scanner.nextLine())*100;
        int desksOnTheRow = (int) ((h - 100)  / 70)  ;
        int totalRows = (int) w / 120;
        int totalDesks = desksOnTheRow * totalRows - 3;

        System.out.println(desksOnTheRow);
        System.out.println(totalRows);
        System.out.println(totalDesks);


    }
}
