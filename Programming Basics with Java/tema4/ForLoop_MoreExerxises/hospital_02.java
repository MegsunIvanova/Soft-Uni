package tema4.ForLoop_MoreExerxises;

import java.util.Scanner;

public class hospital_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int period = Integer.parseInt(scanner.nextLine());
        int doctors = 7;
        int treatedPatients = 0;
        int untreatedPatients = 0;

        for (int i = 1; i <= period; i++) {
            int patients = Integer.parseInt(scanner.nextLine());

            if (i % 3 == 0) {
                if (treatedPatients < untreatedPatients) {
                    doctors += 1;
                }
            }

            if (patients <= doctors) {
                treatedPatients += patients;
            } else {
                treatedPatients += doctors;
                untreatedPatients += patients-doctors;
            }

        }

        System.out.println("Treated patients: "+treatedPatients+".");
        System.out.println("Untreated patients: "+untreatedPatients+".");

    }
}
