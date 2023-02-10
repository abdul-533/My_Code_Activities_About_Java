package Gun14_ForLoop_and_Cantinue;

import java.util.Scanner;

public class _05_forLoop {
    public static void main(String[] args) {
        //Question: Find the product of numbers up to (inclusive) an entered number.

        Scanner scan = new Scanner(System.in);
        System.out.println("Write number=");
        int number = scan.nextInt();

        int multiplication = 1;

        for (int i = 1; i <= number; i++) {
            multiplication = multiplication * i;

        }
        System.out.println("Multiplication = " + multiplication);

        System.out.println();
        // Seconf way:   Extra:    // When the product value of the 2nd part exceeds 100, the process is terminated.


        int multiplication2 = 1;
        for (int b = number; b > 0; b--) {
            multiplication2 = multiplication2 * b;
            if (multiplication2 >= 100) {
                System.out.println("Your multiplication value exceeds 100");
                break;

            }
        }
        if (multiplication2 < 100)
            System.out.println("Multiplication2= " + multiplication2);


    }
}
