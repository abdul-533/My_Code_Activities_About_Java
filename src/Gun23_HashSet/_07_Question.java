package Gun23_HashSet;

import java.util.HashSet;

public class _07_Question {
    public static void main(String[] args) {
        //Question:
        // Define a HashSet in the main. Then in a function
        // randomly from 1 to 20 with a total of 10
        //fill with numbers. Print the set in main.

        HashSet<Integer> hs = new HashSet<>();
        System.out.println(setFunc(hs));

    }

    public static HashSet<Integer> setFunc(HashSet<Integer> hashSet) {
        while (hashSet.size() < 10) {
            int random = 1 + (int) (Math.random() * 20);
            if (!hashSet.contains(random))
                hashSet.add(random);
            else {
                int random2 = 1 + (int) (Math.random() * 20);
                hashSet.add(random2);
            }

        }
        return hashSet;
    }
}
