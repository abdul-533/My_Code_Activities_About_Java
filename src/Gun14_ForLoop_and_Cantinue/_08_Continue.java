package Gun14_ForLoop_and_Cantinue;

import java.util.Scanner;

public class _08_Continue {
    public static void main(String[] args) {
        //Print the letters of a string entered on the screen as one under the other,
        // do not write spaces

        Scanner scan = new Scanner(System.in);
        System.out.print("Write sentence=");
        String text = scan.nextLine();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ')
                continue;
            System.out.println(text.charAt(i));


        }


    }
}
