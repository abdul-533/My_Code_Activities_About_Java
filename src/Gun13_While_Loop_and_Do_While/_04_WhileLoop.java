package Gun13_While_Loop_and_Do_While;

import java.util.Scanner;

public class _04_WhileLoop {
    public static void main(String[] args) {
        //Find the sum of only positive numbers out of the 20 entered numbers
        Scanner scan = new Scanner(System.in);
        int counter = 0;
        int total = 0;
        while (counter <= 20) {
            System.out.print(counter + ". Write number=");
            int number = scan.nextInt();
            if (number > 0)
                total = total + number;

            counter++;

        }
        System.out.print("Total=" + total);

    }
}
