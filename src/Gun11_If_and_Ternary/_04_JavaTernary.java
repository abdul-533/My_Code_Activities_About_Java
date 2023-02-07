package Gun11_If_and_Ternary;

import java.util.Scanner;

public class _04_JavaTernary {
    public static void main(String[] args) {
        //Question:
        //  if the entered number is greater than 50  write "1",
        // otherwise print the value 0 to the screen.
        // Do it with the ternary operator.

        Scanner scan = new Scanner(System.in);
        System.out.print("Write nuber=");
        int number = scan.nextInt();
        String result = (number > 50) ? "1" : "0";

        System.out.println("Result=" + result);


    }
}
