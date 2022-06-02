package tema01_BasicSyntaxConditionalStatementsAndLoops_Lab;

import java.util.Scanner;

public class foreignLanguages_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String language = "";

        switch (country) {
            case "England":
            case "USA":
                language = "English";
                break;
            case "Spain":
            case "Argentina":
            case "Mexico":
                language = "Spanish";
                break;
            default:
                language = "unknown";
        }
        System.out.println(language);
    }
}
