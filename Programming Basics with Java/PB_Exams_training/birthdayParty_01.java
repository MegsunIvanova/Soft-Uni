package PB_Exams_training;

import java.util.Scanner;

public class birthdayParty_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rent = Double.parseDouble(scanner.nextLine());

        double cake = rent * 0.20;
        double drinks = cake * (1 - 0.45);
        double animator = rent / 3;

        double budget = rent + cake + drinks + animator;

        System.out.printf("%.1f", budget);
    }
}
