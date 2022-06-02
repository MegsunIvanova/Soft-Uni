package tema6.NestedLoops_MoreExercises;

import java.util.Scanner;

public class passwordGenerator_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //пароли, които се състоят от следните 5 символа:
        //•	Символ 1: цифра от 1 до n.
        //•	Символ 2: цифра от 1 до n.
        //•	Символ 3: малка буква измежду първите l букви на латинската азбука.
        //•	Символ 4: малка буква измежду първите l букви на латинската азбука.
        //•	Символ 5: цифра от 1 до n, по-голяма от първите 2 цифри.

        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());

        for (int first = 1; first <= n; first++) {
            for (int second = 1; second <= n; second++) {
                for (int third = 97; third < 97 + l; third++) {
                    for (int forth = 97; forth < 97 + l; forth++) {
                        for (int fifth = 1; fifth <= n; fifth++) {
                            if (fifth <= first || fifth <= second) {
                                continue;
                            }
                            String password = "" + first + second + (char) third + (char) forth + fifth;
                            System.out.print(password+" ");
                        }

                    }
                }
            }
        }
    }
}
