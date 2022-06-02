package tema6.NestedLoops_MoreExercises;

import java.util.Scanner;

public class weddingSeats_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char lastSector = scanner.nextLine().charAt(0);
        int firstSectorRows = Integer.parseInt(scanner.nextLine());
        int oddRowSeats = Integer.parseInt(scanner.nextLine());
        int evenRowSeats = oddRowSeats + 2;
        int counter = 0;

        for (int sector = 65; sector <= lastSector; sector++) {
            int currentSectorRows = firstSectorRows + sector - 65;
            for (int row = 1; row <= currentSectorRows; row++) {
                int currentRowSeats = oddRowSeats;
                if (row % 2 == 0) {
                    currentRowSeats = evenRowSeats;
                }
                for (int seat = 97; seat < (currentRowSeats + 97); seat++) {
                    System.out.println("" + (char) sector + row + (char) seat);
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
