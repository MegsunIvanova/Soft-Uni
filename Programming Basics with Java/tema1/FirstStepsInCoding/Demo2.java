package tema1.FirstStepsInCoding;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        //I am <name>, years old.
        // резултатът е String
        System.out.println ("I am "+name+", "+age+" old.");

        int num1 =5;
        int num2 =7;

        // резултатът е number и е 12, извършва се събиране
        System.out.println (num1+num2);

        // резултатът е string и е 57, извършва се конкатенация
        System.out.println (""+num1+num2);

        // резултатът е 12, защото се гледа от ляво на дясно,първо се събира и после се извършва конкатенация
        System.out.println (num1+num2+"");
    }
}
