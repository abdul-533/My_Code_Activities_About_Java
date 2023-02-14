package Gun18_Java_2D_Arrays.Homework;

public class _02_Homework2 {
    public static void main(String[] args) {
        //Question:  2-Create a 2D int Array like this. [{5,2,1} , {10,2,3,6} , {1,2}]
        // Sum the elements in the/2D array.
        //Print the total ,The result should be 32.


        int addition[][] = {
                {5, 2, 1},
                {10, 2, 3, 6},
                {1, 2}
        };

        int total = 0;
        for (int i = 0; i < addition.length; i++) {
            for (int j = 0; j < addition[i].length; j++) {
                total += addition[i][j];
            }
        }
        System.out.println("Total = " + total);

    }
}
