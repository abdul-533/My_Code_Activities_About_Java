package Gun18_Java_2D_Arrays.Homework;

import java.util.ArrayList;

public class _06_Homework6 {
    public static void main(String[] args) {
        //Question:  Create a method called getSum().
        //Parameter must be ArrayList
        // Return type must be int.
        // Add together all the numbers in the ArrayList.
        // return the total result as return.
        //EX:
        //Arraylist = 1,2,3,4,5
        //return should be 15
        ArrayList<Integer> List = new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);


        int sum = getSum(List);
        System.out.println(sum);

    }

    public static int getSum(ArrayList<Integer> yeni) {
        int total = 0;
        for (int i = 0; i < yeni.size(); i++) {
            total= total + yeni.get(i);


        }

        return total;
    }
}
