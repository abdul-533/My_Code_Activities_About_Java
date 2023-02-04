package Gun09;

import java.util.Scanner;

public class _05_JavaIf {
    public static void main(String[] args) {
        // Question: According to the grade of a student entered, from 50
        // if greater-equal, you passed, if less than you failed, print

        Scanner scan = new Scanner(System.in);
        System.out.print("Write your score=");
        int score = scan.nextInt();

        if (score >= 50)
            System.out.println("Congratulation, you pass");

        if (score < 50)
            System.out.println("Sorry, your score is not enough you are cut off");

        // extra for laugh
        if (score == 0)
            System.out.println("You have no place in this school!!))");


    }
}
