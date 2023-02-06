package Day10_About_If_Else;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        // Find the average by reading the midterm(50%) and final(50%) grades entered
        // if the average is greater than or equal to 60, you passed, print congratulations, if not
        // you didnət pass.
        Scanner scan = new Scanner(System.in);
        System.out.println("Write your midterm point= ");
        int midterm = scan.nextInt();
        System.out.println("Write your final point= ");
        int finalM = scan.nextInt();

        double avarage = (midterm + finalM) / 2.0;
        // the average is not a full piece,there for we need a double


        if (avarage >= 60)
            System.out.print("Congratulate you passed");
        else
            System.out.print("I'm sorry you're cut off");


    }
}
