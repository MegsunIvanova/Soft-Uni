package tema5.WhileLoop_MoreExercises;

import java.util.Scanner;

public class streamOfLetters_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String secretCode = "";
        String currentWord = "";
        boolean isC = false;
        boolean isO = false;
        boolean isN = false;

        while (!input.equals("End")) {

            char letter = input.charAt(0);
            if ((letter >= 65 && letter <= 90) || (letter >= 97 && letter <= 122)) {
                switch (letter) {
                    case 'c':
                        if (!isC) {
                            isC = true;
                        } else {
                            currentWord = currentWord + letter;
                        }
                        break;
                    case 'o':
                        if (!isO) {
                            isO = true;
                        } else {
                            currentWord = currentWord + letter;
                        }
                        break;
                    case 'n':
                        if (!isN) {
                            isN = true;
                        } else {
                            currentWord = currentWord + letter;
                        }
                        break;
                    default:
                        currentWord = currentWord + letter;
                        break;
                }
                if (isC && isO && isN) {
                    secretCode = secretCode + currentWord + " ";
                    currentWord = "";
                    isC = false;
                    isO = false;
                    isN = false;
                }
            }

            input = scanner.nextLine();
        }
        System.out.println(secretCode);
    }
}
