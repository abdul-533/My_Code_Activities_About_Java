package Gun09;

import java.util.Scanner;

public class _01_JavaIf {
    public static void main(String[] args) {
        //Question:
        //Algorithm
        // start {
        ///2- read number number=read.nextInt()
        //- if number>10"Write greater than 10" -> if(number>10) sout...
        ///4 -Stop

        Scanner scan=new Scanner(System.in);
        System.out.print("Write number=");
        int number= scan.nextInt();
        if (number>10)
        {// Parentheses to do when if share is provided
            System.out.println(">10");
            System.out.println(" If there is more than 1 command in the if, the parentheses for the if are obligatory");
        }



    }
}
