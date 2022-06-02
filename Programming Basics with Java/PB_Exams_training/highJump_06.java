package PB_Exams_training;

import java.util.Scanner;

public class highJump_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int target = Integer.parseInt(scanner.nextLine());

        int startingHeight = target - 30;
        boolean isFail = false;
        int jumps =0;

        while (startingHeight <= target) {
            for (int i = 1; i <= 3; i++) {
                int currentJump = Integer.parseInt(scanner.nextLine());
                jumps++;
                if (currentJump > startingHeight) {
                    startingHeight += 5;
                    break;
                }
                if (i == 3) {
                    isFail = true;
                    break;
                }
            }
            if (isFail) {
                break;
            }
        }

        if (isFail) {
            System.out.printf("Tihomir failed at %dcm after %d jumps.",startingHeight,jumps);
        } else {
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.",target,jumps);
        }
    }
}
