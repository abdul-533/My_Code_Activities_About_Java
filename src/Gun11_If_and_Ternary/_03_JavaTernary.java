package Gun11_If_and_Ternary;

import java.util.Scanner;

public class _03_JavaTernary {
    public static void main(String[] args) {
        // Print whether the number entered by the user is odd or not.

        Scanner scan = new Scanner(System.in);
        System.out.print("Write Number=");
        int number = scan.nextInt();

        System.out.println((number % 2 != 0) ? "Number is odd" : "Number is even");  // ? -> if ,  : ->else

    }
}
