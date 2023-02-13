package Gun17_Trim_and_Split;

import java.util.Arrays;

public class _05_JavaArrayMethods {
    public static void main(String[] args) {
        //EX:
        String[] names = {"Ahmet", "Zeyneb", "Roman", "Yasin", "Cihan"};

        // Prints arrays directly as strings.
        System.out.println("Names= " + Arrays.toString(names));

        //Array sort:
        Arrays.sort(names);
        System.out.println("(Names) = " + Arrays.toString(names));

        //Are the strings even?

        int[] a = {1, 8, 3, 54};
        int[] b = {1, 8, 3, 54};
        int[] c = {1, 8, 2, 54};
        System.out.println("Arrays.equals(a,b) = " + Arrays.equals(a, b));// true
        System.out.println("Arrays.equals(a,c) = " + Arrays.equals(a, c));// false

        Arrays.sort(c); // after number based array.
        System.out.println("Arrays.toString(c) = " + Arrays.toString(c));

        // Works as a countains, if there is then returned plus value if not then return minus value (sometime find index)
        //EX:

        System.out.println("Arrays.binarySearch(b,3) = " + Arrays.binarySearch(b, 3));
        Arrays.sort(b);
        System.out.println("Arrays.binarySearch(b,3) = " + Arrays.binarySearch(b, 3));


    }
}
