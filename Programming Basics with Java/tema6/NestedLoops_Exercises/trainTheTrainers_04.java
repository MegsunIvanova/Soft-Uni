package tema6.NestedLoops_Exercises;

import java.util.Scanner;

public class trainTheTrainers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String presentationName = scanner.nextLine();
        int counter = 0;
        double sumOfAverageGrades = 0;

        while (!presentationName.equals("Finish")) {
            double sumOfGrades = 0;
            for (int i = 1; i <= n; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                sumOfGrades += grade;
            }
            double averageGrade = sumOfGrades / n;
            System.out.printf("%s - %.2f.%n", presentationName, averageGrade);
            counter++;
            sumOfAverageGrades += averageGrade;

            presentationName = scanner.nextLine();
        }
        double finalAssessment = sumOfAverageGrades / counter;
        System.out.printf("Student's final assessment is %.2f.", finalAssessment);
    }
}
