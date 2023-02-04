package Gun09;

import java.util.Scanner;

public class _03_JavaIf {
    public static void main(String[] args) {
        // Question: Print the value of the larger of the two numbers entered to the screen
        // print equal if equal
        Scanner scan = new Scanner(System.in);
        System.out.println("Write first number=");
        int number1 = scan.nextInt();

        System.out.print("Write second number=");
        int number2 = scan.nextInt();

        if (number1 > number2) // // normal parentheses here must be required
            System.out.print(" Max value=" + number1);

        if (number2 > number1)
            System.out.println("Max value=" + number2);

        if (number1 == number2)
            System.out.println("Numbers are equal");


    }
}
