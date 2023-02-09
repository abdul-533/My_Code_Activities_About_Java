package Gun13_While_Loop_and_Do_While;

import java.util.Scanner;

public class _03_WhileLoop {
    public static void main(String[] args) {
        // Prints the sum of 20 entered numbers to the screen
        Scanner scan = new Scanner(System.in);

        int counter = 1;
        int total = 0;
        while (counter <= 20) {
            System.out.print(counter + ". Write Number=");
            int sayi = scan.nextInt();
            total = total + sayi;

            counter++;

        }
        System.out.print("Total=" + total);


    }
}
