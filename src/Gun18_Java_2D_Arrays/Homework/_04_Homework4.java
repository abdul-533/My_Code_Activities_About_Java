package Gun18_Java_2D_Arrays.Homework;

import java.util.ArrayList;

public class _04_Homework4 {
    public static void main(String[] args) {
        // Question: Create a 2d array [][] and its elements = [ [ 1, 2, 3 ], [ 4, 5, 6 ], [ 7, 8, 9 ] ]
        //Store all the elements in one arraylist and print the arraylist
        //Load an arrayList of all elements and print this arrayList.
        //**Example:
        //[ [ 1, 2, 3 ],
        // [ 4, 5, 6 ],
        // [ 7, 8, 9 ]
        // **Input: [1,2,3,4,5,6,7,8,9]
        int[][] added = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        newArraylist(added);


    }

    public static void newArraylist(int[][] addition) {
        ArrayList<Integer> newArrayList = new ArrayList<>();

        for (int i = 0; i < addition.length; i++) {
            for (int j = 0; j < addition[i].length; j++) {
                newArrayList.add(addition[i][j]);
            }
        }
        System.out.println("New ArrayList = " + newArrayList);
    }
}
