package tema4.ForLoop_Lab;

public class demo5 {
    public static void main(String[] args) {

//        for (int i = 1; i<=12; i++) {
//            System.out.println(i);
//        }


        //този for цикъл също работи

        int i = 1;

        for (; ; ) {
            if (i > 12) {
                break;
            }
            System.out.println(i);
            i++;
        }



    }
}
