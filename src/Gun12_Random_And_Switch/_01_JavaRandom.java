package Gun12_Random_And_Switch;

import java.util.Scanner;

public class _01_JavaRandom {
    public static void main(String[] args) {

        // generate random numbers within the entered max and min range

        Scanner scan = new Scanner(System.in);
        System.out.println("Write Max range=");
        int maxRange = scan.nextInt();
        System.out.println("Write Min range=");
        int minRange = scan.nextInt();

        int randNo = (int) (Math.random() * (maxRange - minRange)) + minRange;
        System.out.print("Random number=" + randNo);

    }
}
