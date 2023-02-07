package Gun11_If_and_Ternary;

import java.util.Scanner;

public class _05_JavaTernary {
    public static void main(String[] args) {
        // Question :
        // Is an entered number zero, negative or positive?
        // print it with the Ternary operator.
        Scanner scan = new Scanner(System.in);
        System.out.print("Write number=");
        int number = scan.nextInt();

        System.out.println("Number is: " + ((number > 0) ? "Positive" : (number < 0) ? "Negative" : " Zero"));
    }
}
