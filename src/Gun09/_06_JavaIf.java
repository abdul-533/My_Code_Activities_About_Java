package Gun09;

import java.util.Scanner;

public class _06_JavaIf {
    public static void main(String[] args) {
        // Question: Find whether the letter a is used in a given sentence. If yes, print No if it does.
        Scanner scan = new Scanner(System.in);
        System.out.println("Write the sentence=");
        String sentence = scan.nextLine();

        if (sentence.contains("a"))
            System.out.println("YES!");

        if (!sentence.contains("a"))
            System.out.println("No!");

        // Second way*********************************
        System.out.println("***********2nd way************");

        if (sentence.indexOf("a") != -1)
            System.out.println("YEAP");
        if (sentence.indexOf("a") == -1)
            System.out.println("NOPE");

        //Third way*************************************
        System.out.println("***********3nd way************");

        boolean isThere = sentence.contains("a");
        if (isThere == true)
            System.out.println("Yes");
        if (isThere == false)
            System.out.println("No");


    }
}
