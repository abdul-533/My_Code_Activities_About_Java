package Gun18_Java_2D_Arrays.Homework;

import java.util.Arrays;

public class _04_Homework4_1 {
    public static void main(String[] args) {

        String[] arr = {"Orange", "Kiwi", "Peach", "Banana", "Orange"};
        System.out.println(getCount(arr));
    }

    public static String getCount(String[] arr) {
        int count = 1;
        String repeat = "";
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1].equals(arr[i])) {
                count++;
                repeat = arr[i];
            }
        }
        return repeat + " " + count + " times";
    }
}
