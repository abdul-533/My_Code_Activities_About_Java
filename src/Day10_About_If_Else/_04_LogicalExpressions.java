package Day10_About_If_Else;

import java.util.Scanner;

public class _04_LogicalExpressions {
    public static void main(String[] args) {
        //Logical Expressions

        // If the entered number is positive and odd then print this number is "appropriate number" on the screen
        // if not then print the this number is "not appropriate number" on the screen
        Scanner scan = new Scanner(System.in);
        System.out.println("Write the number=");
        int number = scan.nextInt();

        if (number % 2 != 0 && number > 0)
            System.out.println("Appropriate number");
        else
            System.out.println("Not appropriate number");
    }
}
