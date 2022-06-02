package tema1.FirstStepsInCoding;

import java.util.Scanner;

public class GreetingByName {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        // Прочитане на код
        String name = scanner.nextLine();

        //Обработка на текста, конкатенация
        String greetings = ("Hello, "+name+"!");

        //Принтиране на резултат, конкатенация
        System.out.println(greetings);



    }
}
