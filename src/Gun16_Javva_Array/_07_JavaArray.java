package Gun16_Javva_Array;

import java.util.Scanner;

public class _07_JavaArray {
    public static void main(String[] args) {
        // Question: Find how many words are in a sentence entered by the user
        // EX: The weather is fine today -> 5

        Scanner scan = new Scanner(System.in);

        System.out.print("Write sentences=");
        String text = scan.nextLine();

        int spacesCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                spacesCount++;
            }

        }
        System.out.println("Count of words = " + (spacesCount + 1));


    }
}
