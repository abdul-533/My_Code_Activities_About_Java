package Gun14_ForLoop_and_Cantinue;

import java.util.Scanner;

public class _04_forLoop {
    public static void main(String[] args) {
        //Question:
        // Find the sum of the numbers up to a digit will enter by the user

        Scanner scan = new Scanner(System.in);
        System.out.println("Write your digit number=");
        int number = scan.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.print(i + ", ");
            if (i == number)
                System.out.print("\b\b:");

        }

    }
}

