package Gun22_2D_Array_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _03_JavaArray2DList {
    public static void main(String[] args) {
        ArrayList<Integer> matNotes = new ArrayList<>();
        ArrayList<Integer> fhycNotes = new ArrayList<>();
        ArrayList<Integer> chemNotes = new ArrayList<>();

        matNotes.add(50);
        matNotes.add(70);
        matNotes.add(80);

        fhycNotes.add(40);
        fhycNotes.add(30);

        chemNotes.add(60);
        chemNotes.add(70);
        chemNotes.add(80);
        chemNotes.add(90);

        //How do I make an Arraylist in Arraylist

        ArrayList<ArrayList<Integer>> notesList = new ArrayList<>();
        notesList.add(matNotes);
        notesList.add(fhycNotes);
        notesList.add(chemNotes);

        //Question 1:

        // Display the grades and display the course names and grades of each course by taking the course names from an ArrayList.
        // print on each line
        // Mathematics: 40 50 60
        // Physics : 30 40
        // Chemistry: 70 80 90 100
        ArrayList<String> lessons = new ArrayList<>(Arrays.asList("Mathematic", "Physics", "Chemistry"));


        for (int i = 0; i < notesList.size(); i++) {
            System.out.print(lessons.get(i) + " : ");

            for (int j = 0; j < notesList.get(i).size(); j++) {
                System.out.print(notesList.get(i).get(j) + "\t");

            }
            System.out.println();
        }


        //Question 2 :
        // By taking the grade of a course requested by the user (0-mat, 1-physics, 2 -chemistry)
        // print only the grades of the desired course in a method
        Scanner reder = new Scanner(System.in);
        System.out.println("Lesson No (0-Mat,1-Phyc,2-Chem) =");
        int lessonNo = reder.nextInt();


        writeLessonsNotes(notesList, lessonNo);

        //Question 3:
        // Print the grade point average and the number of passes of the course given above with a method

        notesAverageAndPassedCount(notesList, lessonNo);


    }

    public static void writeLessonsNotes(ArrayList<ArrayList<Integer>> notesList, int lessonNo) {

        for (int i = 0; i < notesList.get(lessonNo).size(); i++) {
            System.out.print(notesList.get(lessonNo).get(i) + "\t");
        }


    }

    public static void notesAverageAndPassedCount(ArrayList<ArrayList<Integer>> notesList, int lessonNo) {
        int total = 0;
        int counter = 0;
        for (int i = 0; i < notesList.get(lessonNo).size(); i++) {
            total += notesList.get(lessonNo).get(i);

        }


        int average = total / notesList.get(lessonNo).size();
        for (int i = 0; i < notesList.get(lessonNo).size(); i++) {
            if (notesList.get(lessonNo).get(i) > average)
                counter++;


        }

        System.out.println("Average = " + average);
        System.out.println("Counter = " + counter);
        ;

    }
}
