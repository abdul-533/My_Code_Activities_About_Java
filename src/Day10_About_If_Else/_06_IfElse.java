package Day10_About_If_Else;

import java.util.Scanner;

public class _06_IfElse {
    public static void main(String[] args) {
        // Check the compliance of a new password entered with the rules.
        //RULES :
        // 1) must be at least 8 characters
        // 2) must not contain the word "pass"
        // 3) must be a maximum of 12 characters.
        Scanner scan = new Scanner(System.in);
        System.out.println("Write your password: ");
        String password = scan.nextLine();

        if (password.length() >= 8 && password.length() <= 12 && (!password.contains("pass")))
            System.out.println("Your password is true, congratulate");
        else
            System.out.println("You write wrong password");


    }
}
