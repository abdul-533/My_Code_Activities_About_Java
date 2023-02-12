package Gun16_Javva_Array;

import java.util.Scanner;

public class _01_WhatisJavaArray {
    public static void main(String[] args) {
        // Info: I need a variable that can take multiple values in a definition
        // solution:

        int studNote = 0;

        int[] notes = new int[50];// Notes that can store 50 ints.

        notes[0] = 75;
        notes[1] = 88;
        //...
        //...
        // ...
        notes[49] = 95; // total number of last element-1. Ex: length-1 like this
        // Notes that can store values in the range 0-49.

        //nots [50]=50; Challenger explodes)) That's means it is not impossible
        System.out.println(" Nots [0] =" + notes[0]);
        System.out.println("Nots.length= " + notes.length);

        //how to read array.
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < notes.length; i++) {
            System.out.print("Write your note=");
            notes[i] = scan.nextInt();
        }

        for (int i = 0; i < notes.length; i++) {
            System.out.println(notes[i]);// i->1,2,3,...49;
        }


    }
}
