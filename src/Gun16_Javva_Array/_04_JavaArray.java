package Gun16_Javva_Array;

import java.util.Scanner;

public class _04_JavaArray {
    public static void main(String[] args) {
        //Question:
        // After receiving the 7 numbers from the user
        // Find how many of them are odd and greater than the average.
        Scanner scan = new Scanner(System.in);
        int numberrs[] = new int[7];
        int total = 0;

        for (int i = 0; i < numberrs.length; i++) {
            System.out.println("Write number=");
            numberrs[i] = scan.nextInt();
            total += numberrs[i];
        }

        int counter = 0;
        int average = total / numberrs.length;
        for (int i = 0; i < numberrs.length; i++) {
            if (numberrs[i] % 2 != 0 && numberrs[i] > average)
                counter++;
        }
        System.out.println("Average = " + average);
        System.out.println("Counter = " + counter);


    }

}
