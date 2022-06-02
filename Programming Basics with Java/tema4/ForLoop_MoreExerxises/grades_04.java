package tema4.ForLoop_MoreExerxises;

import java.util.Scanner;

public class grades_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = Integer.parseInt(scanner.nextLine());

        double sumGrades = 0;
        int studentsFrom2to3 = 0;
        int studentsFrom3to4 = 0;
        int studentsFrom4to5 = 0;
        int studentsAbove5 = 0;

        for (int i = 1; i <= students; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            sumGrades += grade;

            if (grade >= 2 && grade < 3) {
                studentsFrom2to3++;
            } else if (grade >= 3 && grade < 4) {
                studentsFrom3to4++;
            } else if (grade >= 4 && grade < 5) {
                studentsFrom4to5++;
            } else if (grade >= 5) {
                studentsAbove5++;
            }
        }
        System.out.printf("Top students: %.2f%%%n", (studentsAbove5 * 1.00 / students) * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", (studentsFrom4to5 * 1.00 / students) * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", (studentsFrom3to4 * 1.00 / students) * 100);
        System.out.printf("Fail: %.2f%%%n", (studentsFrom2to3 * 1.00 / students) * 100);
        System.out.printf("Average: %.2f", (sumGrades / students));
    }
}
