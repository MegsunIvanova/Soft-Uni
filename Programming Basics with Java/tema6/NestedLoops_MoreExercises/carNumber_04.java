package tema6.NestedLoops_MoreExercises;

import java.util.Scanner;

public class carNumber_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Всеки един специален автомобилен номер се състой от четири числа
        //•	Ако номерът започва с четна цифра, то той трябва да завършва на нечетна цифра и обратното – ако започва с нечетна,  завършва на четна
        //•	Първата цифра от номера е по-голяма от последната
        //•	Сумата от втората и третата цифра трябва да е четно число

        int intervalStart = Integer.parseInt(scanner.nextLine());
        int intervalEnd = Integer.parseInt(scanner.nextLine());

        for (int firstNum = intervalStart; firstNum <= intervalEnd; firstNum++) {
            for (int secondNum = intervalStart; secondNum <= intervalEnd; secondNum++) {
                for (int thirdNum = intervalStart; thirdNum <= intervalEnd; thirdNum++) {
                    if ((secondNum + thirdNum) % 2 != 0) {
                        continue;
                    }
                    for (int fourthNum = intervalStart; fourthNum <= intervalEnd; fourthNum++) {
                        if ((firstNum % 2 == 0 && fourthNum % 2 == 0) || (firstNum % 2 != 0 && fourthNum % 2 != 0) || (firstNum <= fourthNum)) {
                            continue;
                        }

                        System.out.print(""+firstNum + secondNum + thirdNum + fourthNum+" ");
                    }
                }
            }
        }
    }
}
