package Gun23_HashSet;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class _05_Sets_Question {
    public static void main(String[] args) {
        // String a 10-element array with numbers up to random(10)
        // After filling, create a new file with no repetitive words.
        // assign to array.
        HashSet typeless = new HashSet();// if so, it will be untyped and will take int string without noticing

        Integer[] array = new Integer[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
        }
        System.out.println("Array= " + Arrays.toString(array));

        // First way
        HashSet<Integer> newSet = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            newSet.add(array[i]);

        }
        System.out.println("New Set = " + newSet);

        //Second way
        HashSet<Integer> hs1 = new HashSet<>(Arrays.asList(array));
        System.out.println("hs1 = " + hs1);

        //Third way

        HashSet<Integer> hs2 = new HashSet<>();
        Collections.addAll(hs1, array);
        System.out.println("hs2 = " + hs2);


    }
}
