package Gun16_Javva_Array;

public class _03_JavaArray {
    public static void main(String[] args) {

        int[] array = new int[5]; // 5 element array with index 0,1,2,3,4.
        int[] array2 = {5, 6, 34, 77, 66}; // I have defined an array with 5 elements and given the initial values

        String[] words = new String[5]; // Variable that can store 5 words/phrases
        boolean[] array3 = new boolean[5]; //An array that can store 5 booleans (true/false)
        double[] proportions = new double[5]; // An array variable that can store 5 doubles

        for (int i = 0; i < array.length; i++) {
            System.out.println("Array=" + array[i]);

        }
        for (int i = 0; i < words.length; i++) {
            System.out.println("Woprds=" + words[i]);

        }
        for (int i = 0; i < proportions.length; i++) {
            System.out.println("Proportions=" + proportions[i]);
        }
        for (int i = 0; i < array3.length; i++) {
            System.out.println("Array3=" + array3[i]);
        }


    }
}
