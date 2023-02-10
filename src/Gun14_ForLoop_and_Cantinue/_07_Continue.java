package Gun14_ForLoop_and_Cantinue;

import java.util.Scanner;

public class _07_Continue {
    public static void main(String[] args) {
        //enter 5 numbers from the user
        // add up all of these numbers except those between five and six.

        Scanner scan = new Scanner(System.in);

        int total = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Write number=");
            int number = scan.nextInt();
            if (number > 6 && number < 10)
                continue;
            total += number;

        }
        System.out.println("Total =" + total);


    }
}
