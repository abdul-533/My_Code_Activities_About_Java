package Day10_About_If_Else;

import java.util.Scanner;

public class _05_IfElse {
    public static void main(String[] args) {
        //If the length of a string is greater than 10 and
        // If the word "study" appears, print yes to the screen, otherwise
        // print no on the screen.
        //If the length of a string is greater than 10 and
        // If the word "study" appears, print yes to the screen, otherwise
        // print no on the screen.

        Scanner scan = new Scanner(System.in);
        System.out.println("Write the text: ");
        String text = scan.nextLine();
        if (text.length() > 10 && text.contains("study"))
            System.out.println("Yes, That's true");
        else
            System.out.println("No, That is false");


    }

}

