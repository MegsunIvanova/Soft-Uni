package tema6.NestedLoops_Lap;

public class demo {
    public static void main(String[] args) {

        for (int i = 1; i <= 12; i++) {
            System.out.println("Month: " + i);
            for (int j = 1; j <= 30; j++) {
                System.out.println("Day: " + j);
                if (i == 5 && j == 21) {
                    System.out.println("Today we have lecture!");
                }
            }
        }
    }
}