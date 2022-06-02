package tema4.ForLoop_Lab;

public class demo2_inkrementacia {
    public static void main(String[] args) {
        //Инкрементиране - увеличаването на стойността на дадена променлива:

        //Пре-инкрементация
        //Стойността на променливата a се увеличава с 1 и след това се принтира
        int a = 1;
        System.out.println(++a);
        System.out.println(a);

        //Пост-инкрементация
        //Първо се принтира променливата a и след това се увеличава с 1
        int b = 1;
        System.out.println(b++);
        System.out.println(b);

        //Декрементиране - намаляването на стойността на дадена променлива:

        //Пре-декрементация -
        // Стойността на променливата a се намалява с 1 и след това се принтира:
        int c = 1;
        System.out.println(--c);
        System.out.println(c);

        //Пост-декрементация
        //Първо се принтира променливата a и след това се намалява с 1:
        int d = 1;
        System.out.println(d--);
        System.out.println(d);


    }
}
