package Gun17_Trim_and_Split;


import java.util.Scanner;

public class _04_JavaSplitMethod {
    public static void main(String[] args) {
        // Split:
        // bir stringi parcala ayirmak demek
        // Kullanicidan hedef cumleyilerine gore alt alta kelime yazdiriniz
        Scanner scan = new Scanner(System.in);

        System.out.print("Sentence=");
        String sentence = scan.nextLine();
        String[] sWords = sentence.split(" ");
        System.out.println("********************************");

        for (int i = 0; i < sWords.length; i++) {
            System.out.println("Words = " + sWords[i]);
        }


    }
}
