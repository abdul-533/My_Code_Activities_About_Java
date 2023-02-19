package Gun24_Java_Map;

import java.util.HashMap;

public class _01_JavaMap {
    public static void main(String[] args) {
        //Explanation:
        // Set-> HashSet, LinkedHAshSet, TreeSet
        // Map-> HashMAp, linkedHAshMAp, TreeMap
        //Map=Key+Set-> Set with Key.

        // Let the type of the key be Integer and the type of its value String
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1001, "Ismet Temur");
        hm.put(1002, "Cihat Yilmaz");
        hm.put(2001, "Talib Yildiz");
        hm.put(5001, "Eyyubcan Bilgin");
        hm.put(1002, "Hatice Bayrak");

        System.out.println("hm = " + hm);
        System.out.println("hm.get(2001) = " + hm.get(2001));
        System.out.println("hm.get(5001) = " + hm.get(5001));

        System.out.println("hm.containsKey(2001) = " + hm.containsKey(2001));
        System.out.println("hm.containsKey(12) = " + hm.containsKey(12));

        System.out.println("hm.keySet() = " + hm.keySet()); // returns the key
        System.out.println("hm.values() = " + hm.values()); // returns the value

        hm.remove(5001);// deleted the key
        System.out.println("hm = " + hm);
        System.out.println("hm.size() = " + hm.size());

        hm.clear();
        System.out.println("hm = " + hm);


    }
}
