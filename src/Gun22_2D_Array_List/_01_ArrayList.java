package Gun22_2D_Array_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _01_ArrayList {
    public static void main(String[] args) {
        // ArrayList is An element of the Collection group
        // As we use Arrays.sort while sorting the Array,
        // We will use ArrayList in Collection methods.

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(50);
        numbers.add(5);
        numbers.add(456);
        numbers.add(45);
        numbers.add(3);

        System.out.println("Numbers = " + numbers);

        //sort processing.
        Collections.sort(numbers);
        System.out.println("Numbers...sort = " + numbers);

        // reverse processing.
        Collections.reverse(numbers);
        System.out.println("Numbers...reverse = " + numbers);

        // Finding MAX and Min elements.
        System.out.println("Collections.max(Numbers) = " + Collections.max(numbers));
        System.out.println("Collections.min(Numbers) = " + Collections.min(numbers));

        // Assigning certain values to all elements
        Collections.fill(numbers, 0); // It assigns 0 to all elements.
        System.out.println("Numbers = " + numbers);

        //replace
        Collections.replaceAll(numbers, 0, 5); // dropped 5 to 0 .
        System.out.println("Numbers = " + numbers);

        // assign value while defining.
        int[] array = {2, 3, 4, 5};

        ArrayList<Integer> List = new ArrayList<>(Arrays.asList(3, 4, 5, 6));
        System.out.println("List = " + List);
        ArrayList<String> strList = new ArrayList<>(Arrays.asList("ahmet", "mehmet", "bushra", "roman"));
        System.out.println("strList = " + strList);

        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 2, 3, 4, 5, 6, 7);

        // How do I assign the array directly to the ArrayList.
        Integer[] array2 = {2, 3, 4, 5};
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(array2));
        System.out.println("List = " + list3);


    }
}
