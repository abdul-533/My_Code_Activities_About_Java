package Gun23_HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class _01_HashSet {
    public static void main(String[] args) {
        int number = 5; // stores a number in memory
        int[] array = new int[6]; // stores 6 numbers in memory; fixed size
        int[][] two_D_array = new int[3][20]; // stores 6 numbers in memory; fixed size


        //I need an array, but it should increase as you add the size and decrease as you delete it
        ArrayList<Integer> list = new ArrayList<>(); // the size is changing
        ArrayList<ArrayList<Integer>> List_X_listist = new ArrayList<>(); ///2 dimensional, 2 dimensions are variable

        /**********************************************************/

        //LinkedHashSet-> (Amount in order of insertion) stores elements in order of insertion as you add them
        //TreeSet->        Always keeps them in order as you add them
        // Their common feature is that they have no repetition value.

        HashSet<Integer> hs1 = new HashSet<>();
        hs1.add(1);
        hs1.add(2);
        hs1.add(38);
        hs1.add(22);
        hs1.add(4);
        boolean isAdded = hs1.add(5);
        boolean againAdded = hs1.add(5);
        hs1.add(2);

        System.out.println("Is added? = " + isAdded);
        System.out.println("Is added again? = " + againAdded);
        System.out.println("Hs1 = " + hs1);


    }
}
