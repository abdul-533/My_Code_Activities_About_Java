package Gun18_Java_2D_Arrays;

public class _02_Java2DArrays {
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] array2 = {2, 3, 4, 5, 6, 7, 56, 76, 77};

        int[][] array2D = new int[2][3];
        int[][] array2D1 = {
                {2, 3, 4},
                {34, 45, 5},
        };

        for (int i = 0; i < 2; i++) {
            System.out.print(array2D1[i][0] + " ");
            System.out.print(array2D1[i][1] + " ");
            System.out.print(array2D1[i][2] + " ");
            System.out.println();
        }
        // Method with 2 fors, short and practical, error-free
        System.out.println("******************************");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array2D1[i][j] + " ");
            }
            System.out.println();
        }


    }
}
