package Gun18_Java_2D_Arrays;

import java.util.Scanner;

public class _04_Java2DArrays {
    public static void main(String[] args) {
        // Question:
        // Fill in a 2 by 3 table by getting numbers from the user
        // then find the largest number in a separate loop.
        int[][] array = new int[2][3];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Write number= ");
                array[i][j] = scan.nextInt();
            }

        }
        int max = array[0][0];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j] > max)
                    max = array[i][j];

            }

        }
        System.out.println("Max Number= " + max);


    }
}
