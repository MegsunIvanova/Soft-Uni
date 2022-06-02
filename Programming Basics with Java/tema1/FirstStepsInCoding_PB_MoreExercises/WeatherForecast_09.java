package tema1.FirstStepsInCoding_PB_MoreExercises;

import java.util.Scanner;

public class WeatherForecast_09 {
    public static void main(String[] args) {
        //Напишете програма, която познава дали е топло или студено навън.
        // От конзолата се чете един ред –
        // текст, който подсказва какво е времето.
        // При въвеждане на "sunny" трябва да се отпечата "It's warm outside!".
        // Във всички останали случаи трябва да се отпечата "It's cold outside!".
        Scanner scanner = new Scanner(System.in);
        String entryData = scanner.nextLine();

        if (entryData.equals("sunny")) {
            System.out.println("It's warm outside!");
        } else {
            System.out.println("It's cold outside!");
        }
        ;

    }
}
