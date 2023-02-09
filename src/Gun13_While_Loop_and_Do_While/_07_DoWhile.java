package Gun13_While_Loop_and_Do_While;

import java.util.Scanner;

public class _07_DoWhile {
    public static void main(String[] args) {
        // Do While is inverse of while until the user enters 0
        // curl the sum of the numbers he entered
        Scanner scan = new Scanner(System.in);

        int number;
        int total = 0;
        do { // run at least once control probe
            System.out.print("Write number=");
            number = scan.nextInt();
            total = total + number;

        } while (number != 0);
        System.out.print("Sum=" + total);


    }
}
