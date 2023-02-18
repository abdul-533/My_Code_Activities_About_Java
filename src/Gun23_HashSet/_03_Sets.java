package Gun23_HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class _03_Sets {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Red");
        colors.add("RED");


        // Print to screen.
        System.out.println("Colors = " + colors);

        // How do I print one-by-one on the screen.

        for (String element : colors) {
            System.out.println("Element = " + element);


            Iterator indicator = colors.iterator();
            while (indicator.hasNext()) { // if the next element exists
                System.out.println("The element which  showed = " + indicator.next());
            }


        }
    }
}
