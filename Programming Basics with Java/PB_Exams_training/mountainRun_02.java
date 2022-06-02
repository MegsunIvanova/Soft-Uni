package PB_Exams_training;

import java.util.Scanner;

public class mountainRun_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timePerMeter = Double.parseDouble(scanner.nextLine());
        //наклона на терена го забавя на всеки 50 м. с 30 секунди
        //Да се изчисли времето в секунди, за което Георги ще изкачи
        // разстоянието до върха и разликата спрямо рекорда.
        //Когато се изчислява колко пъти Георги ще се забави в резултат на наклона на терена,
        // резултатът трябва да се закръгли надолу до най-близкото цяло число.

        double georgiTime = distance * timePerMeter + Math.floor((distance / 50) )* 30;

        double diff = georgiTime - record;

        if (diff < 0) {
            System.out.printf("Yes! The new record is %.2f seconds.", georgiTime);
        } else {
            System.out.printf("No! He was %.2f seconds slower.", diff);
        }

    }
}
