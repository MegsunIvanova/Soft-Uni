package PB_Exams_training;

import java.util.Scanner;

public class theMostPowerfulWord_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String currentWord = scanner.nextLine();
        String theMostPowerfulWord = "";
        int maxPoints = Integer.MIN_VALUE;

        while (!currentWord.equals("End of words")) {
            double currentPoints = 0;

            for (int i = 0; i < currentWord.length(); i++) {
                currentPoints += currentWord.charAt(i);
            }
            switch (currentWord.charAt(0)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'y':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'Y':
                    currentPoints *= currentWord.length();
                    break;
                default:
                    currentPoints = Math.floor(currentPoints / currentWord.length());
                    break;
            }

            if (currentPoints > maxPoints) {
                theMostPowerfulWord = currentWord;
                maxPoints = (int) currentPoints;
            }

            currentWord = scanner.nextLine();
        }

        System.out.printf("The most powerful word is %s - %d", theMostPowerfulWord, maxPoints);
    }
}
