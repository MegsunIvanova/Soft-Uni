package tema1.FirstStepsInCoding_PB_Exercises;

import java.util.Scanner;

public class FishTank_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fishTankLengthCm = Integer.parseInt(scanner.nextLine());
        int fishTankWidthCm = Integer.parseInt(scanner.nextLine());
        int fishTankHeightCm = Integer.parseInt(scanner.nextLine());
        double percentageOccupiedCapacity = Double.parseDouble(scanner.nextLine());

        int fishTankVolumeSqCm = fishTankLengthCm * fishTankWidthCm * fishTankHeightCm;
        double fishTankVolumeLiters = fishTankVolumeSqCm * 0.001;
        double litersOfWater = fishTankVolumeLiters - (fishTankVolumeLiters * percentageOccupiedCapacity / 100);
        System.out.println(litersOfWater);


    }
}
