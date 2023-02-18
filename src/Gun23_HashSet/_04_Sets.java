package Gun23_HashSet;

import java.util.HashSet;

public class _04_Sets {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(5);
        hs.add(7);
        hs.add(34);
        hs.add(3);
        hs.add(4);

        System.out.println("hs.size() = " + hs.size());

        hs.remove(5); // Deletes the element by its own value, no concept of index.

        System.out.println("After remove hs = " + hs);

        if (hs.contains(7))
            System.out.println("Have");
        else
            System.out.println("Haven't");

        hs.clear();
        System.out.println("hs = " + hs);


    }
}
