package tema1.FirstStepsInCoding;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //+ - * / %
        double num1 =10;
        int num2 =3;


        //Събиране
        System.out.println(num1+num2);

        //изваждане
        System.out.println(num1-num2);

        //умножение
        System.out.println(num1*num2);

        //делене, ако и делим два int-a, то реултатът ще е целочислен, т.е. int/int = int
        // но ако поне едното е double, то резултатът също ще е double, т.е. int/double = double ili double/int = double
        System.out.println(num1/num2);

        //модулно деление, резутатът е остатъкът от делението
        System.out.println(num1%num2);
    }
}
