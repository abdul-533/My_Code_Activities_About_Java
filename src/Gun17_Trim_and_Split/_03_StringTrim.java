package Gun17_Trim_and_Split;

import java.util.Scanner;

public class _03_StringTrim {
    public static void main(String[] args) {

        // Trim : removes leading and trailing spaces from String
        Scanner reder = new Scanner(System.in);
        System.out.println("Write sentence=");
        String text = reder.nextLine();


        System.out.println("text = ->" + text + "<-");
        System.out.println("text = ->" + text.trim() + "<-");


    }
}
