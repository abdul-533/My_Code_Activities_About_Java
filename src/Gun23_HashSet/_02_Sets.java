package Gun23_HashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _02_Sets {
    public static void main(String[] args) {
        // SETS
        //HashSet; It's fast, it has its own algorithmic order for it, it's tartar in that order
        //LinkedHashSet: Keeps sorted according to ADD order.
        //TreeSet : Always keep them in SEQUENCE, self sorted.

        // Fast, it keeps it in its own algorithmic order
        HashSet<String> hs = new HashSet<>();
        hs.add("one");
        hs.add("two");
        hs.add("three");
        hs.add("four");
        hs.add("five");
        System.out.println("Hs = " + hs);

        // Keeps sorted according to adding order.
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("one");
        lhs.add("two");
        lhs.add("three");
        lhs.add("four");
        lhs.add("five");
        System.out.println("Lhs = " + lhs);

        // Always keeps in SEQUENTIAL, self-sorted
        TreeSet<String> ts = new TreeSet<>();
        ts.add("one");
        ts.add("two");
        ts.add("three");
        ts.add("four");
        ts.add("five");
        System.out.println("Ts = " + ts);


    }
}
