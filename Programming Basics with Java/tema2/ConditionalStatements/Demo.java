package tema2.ConditionalStatements;

public class Demo {
    public static void main(String[] args) {

        //ОПЕРАТОРИ ЗА СРАВНЕНИЕ

        // == != > >= < <=
        // НЕ РАБОТИ ЗА String,
        // ползва се само за числа, символи и др. сравними типове
        int a = 5;
        int b = 7;

        // a равно ли е на b, връща false
        System.out.println(a == b);

        // a различно ли е от b, връща true
        System.out.println(a != b);

        // a по-голямо ли е от b, връща false
        System.out.println(a > b);

        // a по-голямо или равно ли е от b, връща false
        System.out.println(a >= b);

        // a по-малко ли е от b, връща true
        System.out.println(a < b);

        // a по-малко или равно ли е от b, връща true
        System.out.println(a <= b);

    }
}
