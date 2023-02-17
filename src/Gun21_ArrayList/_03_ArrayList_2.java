package Gun21_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_ArrayList_2 {
    public static void main(String[] args) {

        ArrayList<Integer> notes = new ArrayList<>();

        Scanner scanStr = new Scanner(System.in);
        Scanner scanInt = new Scanner(System.in);
        int total = 0;
        String isContinue;

        do {
            System.out.println("Write note =");
            int note = scanInt.nextInt();
            notes.add(note);
            total += note;
            System.out.print("If you want to cantinue write Y, if not write N =");
            isContinue = scanStr.nextLine();

        } while (isContinue.equalsIgnoreCase("Y"));

        int average = total / notes.size();
        int passedCount = 0;
        for (int i = 0; i < notes.size(); i++) {
            if (notes.get(i) > average)
                passedCount++;

        }
        System.out.println("Passed count = " + passedCount);


    }
}
