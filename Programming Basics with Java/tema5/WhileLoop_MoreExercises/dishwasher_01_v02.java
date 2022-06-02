package tema5.WhileLoop_MoreExercises;

import java.util.Scanner;

public class dishwasher_01_v02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int remainingDetergent = Integer.parseInt(scanner.nextLine()) * 750;
        int washedDishes = 0;
        int washedPots = 0;
        int countInput = 0;
        int detergentNeeded = 0;

        while (remainingDetergent >= 0) {
            String input = scanner.nextLine();

            if (input.equals("End")) {
                break;
            }
            countInput++;
            int currentNumber = Integer.parseInt(input);

            switch (countInput) {
                case 1:
                case 2:
                    detergentNeeded = currentNumber * 5;
                    remainingDetergent -= detergentNeeded;
                    if (remainingDetergent >= 0) {
                        washedDishes += currentNumber;
                    }
                    break;
                case 3:
                    detergentNeeded = currentNumber * 15;
                    remainingDetergent -= detergentNeeded;
                    countInput = 0;

                    if (remainingDetergent >= 0) {
                        washedPots += currentNumber;
                    }
                    break;
            }
        }

        if (remainingDetergent < 0) {
            System.out.printf("Not enough detergent, %d ml. more necessary!", -remainingDetergent);
        } else {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n", washedDishes, washedPots);
            System.out.printf("Leftover detergent %d ml.", remainingDetergent);
        }
    }
}




