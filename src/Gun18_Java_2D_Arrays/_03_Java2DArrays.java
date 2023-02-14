package Gun18_Java_2D_Arrays;

public class _03_Java2DArrays {
    public static void main(String[] args) {
        // Question:
        // Fill a 2 by 3 table with random numbers up to 100
        // then print and find how many odd numbers

        int[][] array = new int[2][3];
        int counter = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = (int) (Math.random() * 101);
                System.out.print(array[i][j] + ", ");
                if (array[i][j] % 2 != 0)
                    counter++;

            }
            System.out.println();
        }
        System.out.println("How many is an odd number? = " + counter);


    }
}
