package Day10_About_If_Else;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        //If the entered student score is greater than 50 You passed and
        // If the entered student score isn't greater than 50 then you did not pass

        Scanner scan = new Scanner(System.in);
        System.out.println("Write your mark=");
        int mark = scan.nextInt();

        //1-st Way
        if (mark >= 50)
            System.out.println("Congratulate you passed");
        if (mark < 50)
            System.out.println("Sorry, you didn't pass");

        //2 a-nd Way
        if (mark >= 50) {
            System.out.println("Exam successful");
        } else
            System.out.println("You didn't get grate mark and you  were cut from the exam");

    }
}
