package tema1.FirstStepsInCoding;

import java.util.Scanner;

public class Demo {
    //psvm или main
    public static void main (String[] args){

        // String - текст
        // char - единичен символ
        // int - цяло число
        // double - дробно число

        // Деклаираме скенера, който чете от конзолата
        Scanner scanner = new Scanner (System.in);

        String greetings = scanner.nextLine ();
        System.out.println(greetings);

        // Integer.parseInt () за да преобразуваме въведеното в конзолата в конкретния тип, в случая цяло число
        int num1 = Integer.parseInt (scanner.nextLine());
        System.out.println(num1);

        double num2 = Double.parseDouble (scanner.nextLine());
        System.out.println(num2);

        char symbol = 'S';
        System.out.println(symbol);


    }
}
