package Gun18_Java_2D_Arrays.Homework;

import java.util.ArrayList;

public class _01_Homework1 {
    public static void main(String[] args) {
        //Question:  Create a 2D int Array like this. [{2,3,2} , {4,1,5} , {7,2,5}]
        //Replace all 2's with 6. Print the array.
        int[][] array2 = {
                {2, 3, 2},
                {4, 1, 5},
                {7, 2, 5}
        };
        ArrayList<Integer> List = new ArrayList<>();

        for (int i = 0; i < array2.length; i++) {

            for (int j = 0; j < array2[i].length; j++) {
                List.add(array2[i][j]);
            }

        }
        for (int i = 0; i < List.size(); i++) {
            if (List.get(i) == 2)
                List.set(i, 6);

        }
        System.out.println(List);


    }
}
