package tema1.FirstStepsInCoding;

import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        //Напишете програма, която прочита от конзолата
        // име, фамилия, възраст и град и печата следното съобщение:
        // "You are <firstName> <lastName>, a <age>-years old person from <town>."

        //прочитане от конзолата
        String firstName= scanner.nextLine();
        String lastName= scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();

        // "You are <firstName> <lastName>, a <age>-years old person from <town>."
      //  System.out.println("You are "+firstName+" "+lastName+", a "+age+"-years old person from "+town+".");

        System.out.printf("You are %s %s, a %d-years old person from %s.", firstName, lastName, age, town);
    }
}
