package Gun09;

import java.util.Scanner;

public class _07_JavaIf {
    public static void main(String[] args) {
        //Question: Print the absence of the lowercase or uppercase letter "a" in a given sentence. Available or unavailable
        Scanner scan = new Scanner(System.in);
        System.out.print("Write the sentence:");
        String sc = scan.nextLine();

        sc = sc.toLowerCase();
        if (sc.contains("a"))
            System.out.println("Yes, there is a letter 'a' ");

        if (!sc.contains("a"))
            System.out.println("No, there isn't letter 'a'");

        //Second way
        if (sc.indexOf("a") != -1)
            System.out.println("Yes");
        if (sc.indexOf("a") == -1)
            System.out.println("No");

        //Third way
        boolean isThere = sc.contains("a");
        if (isThere == true)
            System.out.println("YES");
        if (isThere == false)
            System.out.println("NO");


    }
}
