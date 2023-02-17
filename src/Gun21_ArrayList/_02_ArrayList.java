package Gun21_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _02_ArrayList {
    public static void main(String[] args) {
        //Question: An array with 6 elements from the user
        // by assigning only odd-numbered elements to a separate array
        // print.

        Scanner scan = new Scanner(System.in);
        int[] array = new int[6];


        for (int i = 0; i < array.length; i++) {

            System.out.print("Write number= ");
            array[i] = scan.nextInt();

        }
        System.out.println("Array=" + Arrays.toString(array));

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0)
                numbers.add(array[i]);
        }
        System.out.println("Numbers = " + numbers);

        // Second way

//        for (int i = 0; i < array.length; i++) {
//
//            System.out.print("Write number =");
//            array[i] = scan.nextInt();
//            if (array[i] % 2 != 0)
//                numbers.add(array[i]);
//
//        }


    }
}
