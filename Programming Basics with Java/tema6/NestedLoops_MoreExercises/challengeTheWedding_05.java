package tema6.NestedLoops_MoreExercises;

import java.util.Scanner;

public class challengeTheWedding_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int men = Integer.parseInt(scanner.nextLine());
        int women = Integer.parseInt(scanner.nextLine());
        int tables = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        for (int currentMan = 1; currentMan <= men; currentMan++) {
            for (int currentWoman =1; currentWoman<=women;currentWoman++) {
                counter++;
                if (counter > tables) {
                    break;
                }
                System.out.printf("(%d <-> %d) ",currentMan,currentWoman);
            }
        }

    }
}
