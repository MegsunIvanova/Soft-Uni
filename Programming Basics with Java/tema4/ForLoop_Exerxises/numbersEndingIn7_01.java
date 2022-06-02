package tema4.ForLoop_Exerxises;

public class numbersEndingIn7_01 {
    public static void main(String[] args) {

        //Напишете програма, която отпечатва числата в диапазона от 1 до 1000,
        // които завършват на 7.

        for (int i = 7; i < 1000; i++) {
            if (i % 10 == 7) {
                System.out.println(i);
            }
        }
    }
}
