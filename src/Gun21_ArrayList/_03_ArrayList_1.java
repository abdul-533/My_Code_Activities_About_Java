package Gun21_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_ArrayList_1 {
    public static void main(String[] args) {
        //Interesting Question:
        // Get as many grades as a teacher wants to enter,
        // Ask if you want to continue teaching (Y/N)
        // and find the number of students who passed the average.

        Scanner scanStr = new Scanner(System.in);
        Scanner scanInt = new Scanner(System.in);
        ArrayList<Integer> notes = new ArrayList<>();


        String added;
        do {

            System.out.print("Write number =");
            int number = scanInt.nextInt();
            notes.add(number);
            System.out.print("If you want to cantinue write Y, if not write N =");
            added = scanStr.nextLine();

        } while (added.equalsIgnoreCase("Y"));
        int total = 0;

        for (int i = 0; i < notes.size(); i++) {
            total += notes.get(i);

        }
        int counter = 0;
        int arevage = total / notes.size();
        for (int i = 0; i < notes.size(); i++) {
            if (notes.get(i) > arevage)
                counter++;


        }
        System.out.println("Result  = " + counter);


    }
}
