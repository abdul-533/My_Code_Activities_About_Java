package Gun13_While_Loop_and_Do_While;

import java.util.Scanner;

public class _08_DoWhile {
    public static void main(String[] args) {
        //Write the program that reads "program runs"
        // until x is entered from the user, and "program is over" when x is entered
        Scanner scan = new Scanner(System.in);
        String entered;

        do {
            System.out.println("Write expressio: ");
            entered = scan.nextLine();

            if (entered.equalsIgnoreCase("x")) {
                continue;
            }
            System.out.println("Program is working...");

        } while (!entered.equalsIgnoreCase("x"));

        System.out.println("Program is over");
    }
}
