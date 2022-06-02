package tema1.FirstStepsInCoding_PB_MoreExercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HousePainting_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //От конзолата се четат 3 реда:
        //1.	x – височината на къщата – реално число в интервала [2...100]
        //2.	y – дължината на страничната стена – реално число в интервала [2...100]
        //3.	h – височината на триъгълната стена на прокрива – реално число в интервала [2...100]
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        //за стените се използва зелена боя, а за покрива – червена.
        // Разхода на зелената боя е 1 литър за 3.4 м2,
        // а на червената – 1 литър за 4.3 м2.

        //Стените имат следните размери:
        //•	Предната и задната стена са квадрати със страна „x“
        //o	на предната стена има правоъгълна врата с широчина 1.2м и височина 2м
        //•	Страничните стени са правоъгълници със страни „x“ и „y“
        //o	и на двете странични стени има по един квадратен прозорец със страна 1.5м
        //Покривът има следните размери:
        //•	Два правоъгълника със страни „x“ и „y“
        //•	Два равностранни триъгълника със страна „x“ и височина „h“

        double totalAreaFrontAndRearWalls = (x * x) * 2 - 1.2 * 2;
        double totalAreaSideWalls = ((x * y) - (1.5 * 1.5)) * 2;
        double totalGreenArea = totalAreaFrontAndRearWalls + totalAreaSideWalls;
        double totalLitresGreenDie = totalGreenArea / 3.4;

        double totalAreaRoofRectangles = x * y * 2;
        double totalAreaRoofTriangles = (0.5 * x * h) * 2;
        double totalRedArea = totalAreaRoofRectangles + totalAreaRoofTriangles;
        double totalLitresRedDie = totalRedArea / 4.3;

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println(df.format(totalLitresGreenDie));
        System.out.println(df.format(totalLitresRedDie));

    }
}
