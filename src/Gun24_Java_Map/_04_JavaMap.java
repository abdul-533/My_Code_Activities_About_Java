package Gun24_Java_Map;

import java.util.*;

public class _04_JavaMap {
    public static void main(String[] args) {

        Map<Integer, String> hm = new HashMap<>();

        hm.put(9, "fox");
        hm.put(2, "cat");
        hm.put(30, "dog");
        hm.put(11, "bird");
        hm.put(4, "wolf");
        System.out.println("hm = " + hm); // order according to itself to work fast

        Map<Integer, String> lm = new LinkedHashMap<>();

        lm.put(9, "fox");
        lm.put(2, "cat");
        lm.put(30, "dog");
        lm.put(11, "bird");
        lm.put(4, "wolf");
        System.out.println("lm = " + lm); // sort by the order in which they were added

        Map<Integer, String> tm = new TreeMap<>();

        tm.put(9, "fox");
        tm.put(2, "cat");
        tm.put(30, "dog");
        tm.put(11, "bird");
        tm.put(4, "wolf");
        System.out.println("tm = " + tm); // always keeps sorted by itself, according to the KEY


    }
}
