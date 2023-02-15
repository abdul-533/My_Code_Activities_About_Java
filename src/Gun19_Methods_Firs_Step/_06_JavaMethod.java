package Gun19_Methods_Firs_Step;

import java.util.Arrays;
import java.util.Scanner;

public class _06_JavaMethod {
    public static void main(String[] args) {
        //Question:  After filling an array with 5 elements from the user,
        // the smallest, largest element of the array and find the average in separate functions and print it.
        Scanner scan = new Scanner(System.in);

        int array[] = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Write Number= ");
            array[i] = scan.nextInt();
        }


        printMin(array);

        printMax(array);

        printAverage(array);

    }


    public static void printMin(int[] numbers) {
        Arrays.sort(numbers);
        System.out.println("Min = " + numbers[0]);

    }

    public static void printMax(int[] numbers) {
        Arrays.sort(numbers);
        System.out.println("Max = " + numbers[numbers.length - 1]);
    }

    public static void printAverage(int[] numbers) {
        int total = 0;
        for (int i = 0; i < 5; i++) {
            total += numbers[i];

        }
        System.out.println("Average =" + total / numbers.length);


    }


}
