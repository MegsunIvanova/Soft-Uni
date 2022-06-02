package tema3.ConditionalStatementsAdvanced_MoreExercises;

import java.util.Scanner;

public class bikeRace_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int juniors = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String track = scanner.nextLine();
        double donatedAmount = 0;

        switch (track) {
            case "trail":
                donatedAmount = (juniors*5.5+seniors*7)*0.95;
                break;
            case "cross-country":
                if (juniors+seniors<50){
                    donatedAmount = (juniors*8+seniors*9.5)*0.95;
                } else {
                    donatedAmount = ((juniors*8+seniors*9.5)*0.75)*0.95;
                }
                break;
            case "downhill":
                donatedAmount = (juniors*12.25+seniors*13.75)*0.95;
                break;
            case "road":
                donatedAmount = (juniors*20+seniors*21.5)*0.95;
                break;
        }
        System.out.printf("%.2f", donatedAmount);
    }
}
