package tema4.ForLoop_Exerxises;

import java.util.Scanner;

public class trekkingMania_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groups = Integer.parseInt(scanner.nextLine());
        int totalPeople = 0;
        int peopleMusala = 0;
        int peopleMonblan = 0;
        int peopleKilimanjaro = 0;
        int peopleK2 = 0;
        int peopleEverest = 0;

        for (int i = 1; i <= groups; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            totalPeople += people;

            if (people <= 5) {
                peopleMusala += people;
            } else if (people <= 12) {
                peopleMonblan += people;
            } else if (people <= 25) {
                peopleKilimanjaro += people;
            } else if (people <= 40) {
                peopleK2 += people;
            } else if (people >= 41) {
                peopleEverest += people;
            }

        }
        System.out.printf("%.2f%%%n",((peopleMusala*1.00)/totalPeople)*100);
        System.out.printf("%.2f%%%n",((peopleMonblan*1.00)/totalPeople)*100);
        System.out.printf("%.2f%%%n",((peopleKilimanjaro*1.00)/totalPeople)*100);
        System.out.printf("%.2f%%%n",((peopleK2*1.00)/totalPeople)*100);
        System.out.printf("%.2f%%%n",((peopleEverest*1.00)/totalPeople)*100);

    }
}
