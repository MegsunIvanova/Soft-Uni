package tema6.NestedLoops_Lap;

public class clock_01 {
    public static void main(String[] args) {

        for (int h = 0; h <= 23; h++) {
            for (int m = 0; m <= 59; m++) {
                System.out.printf("%02d:%02d%n", h, m); //да е двуцуфрено
            }
        }
    }
}
