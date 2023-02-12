package Gun16_Javva_Array;

public class _06_JavaArray {
    public static void main(String[] args) {
        // Question: Define an array with 50 elements, assigning Random numbers up to 10
        // fill in. Then with a separate loop, assign 1 to odd ones and 0 to couple ones.

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);

        }
        //before array
        for (int i = 0; i < array.length; i++) {
            System.out.println("Before Array: " + array[i]);

        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) //if couple
                array[i] = 0;
            else //if odd
                array[i] = 1;


        }//After array
        System.out.println("*********************************************************");
        for (int i = 0; i < array.length; i++) {
            System.out.println("After Array: " + array[i]);


        }


    }
}
