package tema4.ForLoop_MoreExerxises;

import java.util.Scanner;

public class footballLeague_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = Integer.parseInt(scanner.nextLine());
        int allFans = Integer.parseInt(scanner.nextLine());
        int sectorA = 0;
        int sectorB = 0;
        int sectorV = 0;
        int sectorG = 0;

        for (int i = 1; i <= allFans; i++) {
            String sector = scanner.nextLine();
            switch (sector) {
                case "A":
                    sectorA++;
                    break;
                case "B":
                    sectorB++;
                    break;
                case "V":
                    sectorV++;
                    break;
                case "G":
                    sectorG++;
                    break;
            }
        }
        System.out.printf("%.2f%%%n", (sectorA * 1.00 / allFans) * 100);
        System.out.printf("%.2f%%%n", (sectorB * 1.00 / allFans) * 100);
        System.out.printf("%.2f%%%n", (sectorV * 1.00 / allFans) * 100);
        System.out.printf("%.2f%%%n", (sectorG * 1.00 / allFans) * 100);
        System.out.printf("%.2f%%%n", (allFans* 1.00 / capacity) * 100);

    }
}
