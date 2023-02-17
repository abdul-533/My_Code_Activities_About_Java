package Gun22_2D_Array_List;

import java.util.ArrayList;

public class _02_Java2DArrayList {
    public static void main(String[] args) {

        int number = 5; // variable type that can hold a single digit
        int[] array = new int[20]; // Variable that can store 20 numbers, fixed length
        int[][] two_D_Array = new int[20][2];// Variable that can store 20x2 numbers, fixed length


        ArrayList<Integer> List = new ArrayList<>(); // number can be added as desired, length is variable


        //Example Question: There are 20 people in a class and they have 3 lessons.
        // How can I assign students' attributes of these 3 courses to a phrase


        ArrayList<Integer> matNotes = new ArrayList<>();
        ArrayList<Integer> fizNotes = new ArrayList<>();
        ArrayList<Integer> kimNotes = new ArrayList<>();

        matNotes.add(50);
        matNotes.add(70);
        matNotes.add(80);
        System.out.println("Mat.Notes = " + matNotes);
        fizNotes.add(30);
        fizNotes.add(40);
        System.out.println("Fiz.Notes = " + fizNotes);
        kimNotes.add(60);
        kimNotes.add(70);
        kimNotes.add(80);
        kimNotes.add(90);
        System.out.println("Kim.Notes = " + kimNotes);

        //How do I make an Arrayluist in Arraylist

        ArrayList<ArrayList<Integer>> notesLists = new ArrayList<>();
        notesLists.add(matNotes);
        notesLists.add(fizNotes);
        notesLists.add(kimNotes);
        System.out.println("Notes lists = " + notesLists);

        notesLists.get(0);
        System.out.println("Notes Lists = " + notesLists.get(0));

        int math1Notes = notesLists.get(0).get(0);
        System.out.println("Math1 Note = " + math1Notes);

        System.out.println("Notes Lists = " + notesLists.get(0)); // ,at notlari
        System.out.println("Notes Lists = " + notesLists.get(1));  // fizik notlari
        System.out.println("Notes Lists = " + notesLists.get(2)); // kimya notlari

        // Another way , replace the above with a for loop

        for (int i = 0; i < notesLists.size(); i++) {
            System.out.println("Notes Lists = " + notesLists.get(i));

        }


        /*************Printing in rows and columns*********/
        for (int i = 0; i < notesLists.size(); i++) {
            for (int j = 0; j < notesLists.get(i).size(); j++) {
                System.out.println("Notes Lists = " + notesLists.get(i).get(j));

            }
            System.out.println();
        }


    }
}
