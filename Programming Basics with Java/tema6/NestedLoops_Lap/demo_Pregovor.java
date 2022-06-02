package tema6.NestedLoops_Lap;

public class demo_Pregovor {
    public static void main(String[] args) {


//        int i = 0;
//        while(i <= 5) {
//            System.out.println("SoftUni");
//            i++;
//        }


//        int i = 0;
//        while(i == 0) {
//            System.out.println("SoftUni");
//            if(i == 1)
//                break;
//        }

//        int i = 0;
//        while (i < 6) {
//            i++;
//            if (i % 2 == 0)
//                System.out.print(i);
//        }

        int i = 0;
        while (i < 4) {
            switch (i) {
                case 1:
                    System.out.print(i);
                case 2:
                    System.out.print(i);
                    break;
                case 3:
                    System.out.print(i);
                    break;
            }
            i++;
        }


    }
}
