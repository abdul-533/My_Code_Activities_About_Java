package Gun17_Trim_and_Split;

import java.util.Arrays;
import java.util.Scanner;

public class _06_JavaArraysMethod {
    public static void main(String[] args) {
        //Question:
        // After filling an array with 10 elements randomly, search for a number entered by the user
        // If this number exists, print its index
        Scanner scan = new Scanner(System.in);
        int[] array = new int[10];


        for (int i = 0; i < array.length; i++)
            array[i] = (int) (Math.random() * 11);
        {

        }

        System.out.println(Arrays.toString(array));
        System.out.print("Write number=");
        int users = scan.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == users)
                System.out.println("Number is in the " + i + " indext");

        }


    }
}
