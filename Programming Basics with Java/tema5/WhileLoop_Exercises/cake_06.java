package tema5.WhileLoop_Exercises;

import java.util.Scanner;

public class cake_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cakeWidth = Integer.parseInt(scanner.nextLine());
        int cakeLength = Integer.parseInt(scanner.nextLine());
        int totalPieces = cakeLength * cakeWidth;

        while (totalPieces > 0) {
            String input = scanner.nextLine();

            if (input.equals("STOP")) {
                break;
            }
            int piecesTaken = Integer.parseInt(input);
            totalPieces -= piecesTaken;
        }

        if (totalPieces > 0) {
            System.out.printf("%d pieces are left.", totalPieces);
        } else {
            System.out.printf("No more cake left! You need %d pieces more.", - totalPieces);
        }

    }
}

