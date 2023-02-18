package Gun23_HashSet;

import java.util.HashSet;

public class _06_Sets {
    public static void main(String[] args) {

        HashSet<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        setA.add(5);

        HashSet<Integer> setB = new HashSet<>();
        setB.add(4);
        setB.add(5);
        setB.add(6);
        setB.add(7);

        System.out.println("setA = " + setA);
        System.out.println("setB = " + setB);

        /*** Combining  ***/
        HashSet<Integer> combineVersion = new HashSet<>();
        combineVersion.addAll(setA);
        combineVersion.addAll(setB);
        System.out.println("Combine version= " + combineVersion);

        /*** Difference  ***/
        HashSet<Integer> difference = new HashSet<>();
        difference.addAll(setA);
        difference.removeAll(setB); // Subtracted B from A
        System.out.println("Difference = " + difference);

        /*** common elements, intersection***/
        HashSet<Integer> commanElements = new HashSet<>();
        commanElements.addAll(setA);
        commanElements.retainAll(setB);
        System.out.println("Comman elements = " + commanElements);


    }
}
