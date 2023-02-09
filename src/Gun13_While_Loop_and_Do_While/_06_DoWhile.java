package Gun13_While_Loop_and_Do_While;

import java.util.Scanner;

public class _06_DoWhile {
    public static void main(String[] args) {
        // DoWhile- inverse of while
        //until the user enters 0
        // find the sum of the numbers in the input
        Scanner scan = new Scanner(System.in);

        int number;
        int total = 0;

        System.out.print("Write number=");
        number = scan.nextInt();
        total = total + number;

        while (number != 0) {
            System.out.print("Write number=");
            number = scan.nextInt();

            total = total + number;
        }
        System.out.println("Total=" + total);


    }
}
