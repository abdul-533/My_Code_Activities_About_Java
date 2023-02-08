package Gun12_Random_And_Switch;

import java.util.Scanner;

public class _01_2_JavaRandom {
    public static void main(String[] args) {
        // Trying to guess by generating random numbers up to an entered number
        // print congratulations if the user knows.
        Scanner scan = new Scanner(System.in);
        System.out.print("Number limit to be produced= ");
        int sinir = scan.nextInt();

        int randNumber = (int) (Math.random() * sinir);

        System.out.println("Your estimate=");
        int estimate = scan.nextInt();

        if (estimate == randNumber)
            System.out.println("Congratulation");
        else System.out.println("sorry, You didn't know try again");


    }
}
