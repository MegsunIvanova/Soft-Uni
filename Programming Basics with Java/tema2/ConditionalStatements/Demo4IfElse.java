package tema2.ConditionalStatements;

import java.util.Scanner;

public class Demo4IfElse {
    public static void main(String[] args) {

        //проста проверка if else
        Scanner scanner = new Scanner(System.in);
        int myMoney = Integer.parseInt(scanner.nextLine());
        int price = 100;

        if (myMoney >= price) {
            //true
            System.out.printf("You bye a jacket for %dlv.", price);
        } else {
            //false
            System.out.println("Not enogh money");
        }
    }
}
