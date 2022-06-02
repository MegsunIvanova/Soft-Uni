    package PB_Exam;
    
    import java.util.Scanner;
    
    public class uniquePINCodes_06 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            int firstNumMax = Integer.parseInt(scanner.nextLine());
            int secondNumMax = Integer.parseInt(scanner.nextLine());
            int thirdNumMax = Integer.parseInt(scanner.nextLine());
    
            for (int i = 2; i <= firstNumMax; i += 2) {
                for (int j = 2; j <= secondNumMax; j++) {
                    if (j == 4 || j == 6 || j == 8 || j == 9) {
                        continue;
                    }
                    for (int k = 2; k <= thirdNumMax; k += 2) {
                        System.out.println(i + " " + j + " " + k);
                    }
                }
    
            }
        }
    }
