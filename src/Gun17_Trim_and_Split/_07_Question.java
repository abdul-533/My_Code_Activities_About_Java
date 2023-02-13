package Gun17_Trim_and_Split;

import java.util.Arrays;
import java.util.Scanner;

public class _07_Question {
    public static void main(String[] args) {
        //Question:
        // After filling an array with 10 elements randomly, search for a number entered by the user
        // If this number exists, print its index
        //Again
        Scanner scan = new Scanner(System.in);
        int[] array = new int[10];


        for (int i = 0; i < array.length; i++)
            array[i] = (int) (Math.random() * 11);
        {

        }

        System.out.println(Arrays.toString(array));
        System.out.print("Write number=");
        int user = scan.nextInt();
        boolean isFind = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == user) {
                isFind = true;
                System.out.println("The index found is  = " + i);
            }

        }
        if (!isFind) {
            System.out.println("The index isn't found");
        }


    }
}
