package Gun09;

import java.util.Scanner;

public class _04_JavaIf {
    public static void main(String[] args) {
        // Question: Print whether a given number is odd or even
        Scanner scan = new Scanner(System.in);
        System.out.print("Write a number=");
        int number = scan.nextInt();

        if (number % 2 != 0)
            System.out.println("This number is odd");
        if (number % 2 == 0)
            System.out.println("This number is even");


    }
}
