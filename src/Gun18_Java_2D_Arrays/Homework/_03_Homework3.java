package Gun18_Java_2D_Arrays.Homework;

import java.util.ArrayList;

public class _03_Homework3 {
    public static void main(String[] args) {
        ///-))Create a 2D String Array as below.
        //[{"new jersey","atlanta","ohio"} ,
        //{"Pittsburgh" ,"ohio","new york","ohio"} ,
        //{"ohio","new york"}]
        //Replace all ohio with Florida.
        // print the array.
        String[][] text = {
                {"new jersey", "atlanta", "ohio"},
                {"Pittsburgh", "ohio", "new york", "ohio"},
                {"ohio", "new york"}
        };
        ArrayList<String> text1 = new ArrayList<>();

        for (int i = 0; i < text.length; i++) {
            for (int j = 0; j < text[i].length; j++) {
                text1.add(text[i][j]);

            }
            for (int j = 0; j < text1.size(); j++) {
                if (text1.get(i).equals("ohio"))
                    text1.set(i, "new york");
            }
        }
        System.out.println("text1 = " + text1);


    }
}
