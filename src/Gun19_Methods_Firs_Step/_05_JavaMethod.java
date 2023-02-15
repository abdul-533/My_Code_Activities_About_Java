package Gun19_Methods_Firs_Step;

import java.util.Arrays;

public class _05_JavaMethod {
    public static void main(String[] args) {
        // Question: Sort the elements of a 20-element array with random numbers up to 100
        // fill in a function and print in the same function.
        int[] array = new int[20];
        randomFill(array);


    }

    public static void randomFill(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101);


        }
        System.out.println("Numbers= " + Arrays.toString(array));


    }


}
