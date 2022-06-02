package tema2.ConditionalStatements;

import java.util.Scanner;

public class Demo5Rounding {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double num = 5.3567;
        System.out.printf("%.0f %n", num);
        System.out.printf("%.2f %n", num); // закръгля до 2 знак
        System.out.println(Math.round(num)); // закръгля до цяло число като "%.0f"
        System.out.println(Math.ceil(num)); // закръгля нагоре
        System.out.println(Math.floor(num)+" закръгля надолу"); // закръгля надолу
        System.out.println(Math.abs(num)); // абсолютна стойност

        //зактъгляне нагоре и принт без дес.запетая
        double num2 = Math.ceil(num);
        System.out.printf("%.0f %n", num2);

    }
}
