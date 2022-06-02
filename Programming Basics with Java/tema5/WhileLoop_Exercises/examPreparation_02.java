package tema5.WhileLoop_Exercises;

import java.util.Scanner;

public class examPreparation_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxPoorGrades = Integer.parseInt(scanner.nextLine());
        int countPoorGrades = 0;
        int sumGrades = 0;
        double countProblems = 0;
        String lastProblem = "";
        boolean win = false;

        while (countPoorGrades < maxPoorGrades) {
            String problemName = scanner.nextLine();
            if (problemName.equals("Enough")) {
                win = true;
                break;
            }
            int currentGrade = Integer.parseInt(scanner.nextLine());
            if (currentGrade <= 4) {
                countPoorGrades++;
            }
            sumGrades += currentGrade;
            countProblems++;
            lastProblem = problemName;
        }


        if (!win) {
            System.out.printf("You need a break, %d poor grades.", countPoorGrades);

        } else {
            System.out.printf("Average score: %.2f%n", (sumGrades / countProblems));
            System.out.printf("Number of problems: %.0f%n", countProblems);
            System.out.printf("Last problem: %s", lastProblem);
        }

    }
}
