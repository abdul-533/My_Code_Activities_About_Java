package Day10_About_If_Else;

import java.util.Scanner;

public class _03_IfElse {
    public static void main(String[] args) {
        //Print whether a number entered is even or odd.
        Scanner scan = new Scanner(System.in);
        System.out.println("Write number=");
        int number = scan.nextInt();

        if (number%2!=0)
            System.out.println("This number is odd  number");
        else
            System.out.println("This number is even number");

    }
}
