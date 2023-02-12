package Gun16_Javva_Array;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        //Question:  Enter grades for an average class of 50 and above
        // find and print how many notes there are.

        int[] notes = new int[5];

        Scanner scan = new Scanner(System.in);
        int total = 0;
        for (int i = 0; i < notes.length; i++) {
            System.out.print("Write notes=");
            notes[i] = scan.nextInt();

            total += notes[i];

        }
        int passed = 0;
        int average = total / notes.length;
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] > average) {
                System.out.println("Passed notes=" + notes[i]);
                passed++;
            }

        }
        System.out.println("Passed=" + passed);
        System.out.println("Average=" + average);

    }
}
