package tema4.ForLoop_Lab;

public class demo {
    public static void main(String[] args) {
        int a = 5;
        switch (a) {
            case 5:
            case 6:
                a = a + 1;
                break;
            default:
                a = a + 2;
                break;
        }
        System.out.println(a);

        System.out.println(!(5 == 5) && (4 + 1 == 5));
        System.out.println(!(3 == 3) || (3 == 5));
        System.out.println(!(3 > 5) || (1 == 1));

        int number = 101;
        if (number >= 1) {
            System.out.println("Larger than 1");
        }
        if (number <= 101) {
            System.out.println("Less than 101");
            System.out.println("Equal to 101");
        }

    }
}
