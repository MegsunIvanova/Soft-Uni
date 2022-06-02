package tema1.FirstStepsInCoding;

import java.util.Scanner;

public class ProjectCreation {
    public static void main(String[] args) {

        //  Напишете програма, която изчислява колко часа ще са необходими на един архитект,
        //  за да изготви проектите на няколко строителни обекта.
        //  Изготвянето на един проект отнема три часа.
        //От конзолата се четат 2 реда:
        //1.	Името на архитекта - текст
        //2.	Брой на проектите, които трябва да изготви -
        // цяло число в интервала [0 … 100]
        //На конзолата се отпечатва:
        //•	"The architect {името на архитекта} will need {необходими часове} hours to complete {брой на проектите} project/s."

        Scanner scanner = new Scanner (System.in);
        String name = scanner.nextLine();
        int projectsCount = Integer.parseInt (scanner.nextLine());
        int totalTime = projectsCount * 3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name,totalTime, projectsCount);

    }
}
