package Gun18_Java_2D_Arrays.Homework;

import java.util.ArrayList;

public class _05_Homework5 {
    public static void main(String[] args) {
        //Question:  Create a method called getCount().
        //One String ArayList and one String as parameter
        // Return type must be int.
        //Specify and return the number of times a value in the ArrayList is repeated.
        //For example;
        //ArrayList = Orange , Kiwi , Peach , Banana , Orange
        //String Orange:
        //Count must be 2 (Orange written twice)
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Orange");
        fruit.add("kiwi");
        fruit.add("Peach");
        fruit.add("Banana");
        fruit.add("Orange");


        String orange = "Orange";
        getCount(fruit);
        System.out.print("Counter=" + getCount(fruit) + " " + "times");


    }

    public static int getCount(ArrayList<String> text) {
        int convertor = 1;
        String repeat = "";
        for (int i = 1; i < text.size(); i++) {
            if (text.get(i - 1).equals(text.get(i))) {
                convertor++;
               repeat = text.get(i);
            }
        }

        return convertor;
    }
}
