package Gun18_Java_2D_Arrays;

import java.util.Scanner;

public class _01_JAva2DArrays {
    public static void main(String[] args) {
        int number = 0;// 1 number
        int[] array = new int[100];// 100 number
        int[] lessonMark = new int[50];
        int[] lesson2Mark = new int[50];
        int[] lesson3Mark = new int[50];


        int[][] allLessonMark = new int[3][50];

        lessonMark[0] = 80;
        allLessonMark[0][0] = 80;
        System.out.println("All Lessons Marks[0][0] = " + allLessonMark[0][0]);
        Scanner scan = new Scanner(System.in);
        allLessonMark[0][0] = scan.nextInt();
        System.out.println("All Lessons Mark = " + allLessonMark[0][0]);


    }
}
