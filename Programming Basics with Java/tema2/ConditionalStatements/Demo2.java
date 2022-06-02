package tema2.ConditionalStatements;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {

        //сравнение на String

        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.nextLine();
        String name2 = "Peter";
        boolean isEquals = name1.equals(name2);

        // това не работи за String,
        // защото сравнява двата текста по адреси в паметта,
        // а не по съдържанието им:
        System.out.println(name1 == name2);

        //Променливи от тип String сравняваме чрез метода equals
        System.out.println(name2.equals(name1));
        System.out.println(isEquals);


    }
}
