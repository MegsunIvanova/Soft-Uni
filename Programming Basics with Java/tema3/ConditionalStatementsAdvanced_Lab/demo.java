package tema3.ConditionalStatementsAdvanced_Lab;

public class demo {
    public static void main(String[] args) {
        if ("caseSensitive".equals("CaseSensitive")) {
            System.out.println("Correct!");
        } else {
            System.out.println("Not correct!");
        }

        System.out.println(123456 % 100 == 56);

        String role = "Administrator";
        if (role.equals("Administrator")) {
            System.out.println("Welcome");
        } else {
            System.out.println("No permission");
        }

    }

}
