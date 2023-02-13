package Gun17_Trim_and_Split;

public class _04_CharVeSayi {
    public static void main(String[] args) {
        // Ascii table:
        int number = 65;
        System.out.println("number= " + number);
        number = 97;


        char letter = (char) number;
        System.out.println("Letter = " + number);


        for (int i = 0; i < 255; i++) {
            letter = (char) i;
            System.out.println(i + " :Letter = " + letter);

        }
        int number2 = (int) 'a';
        System.out.println("Number2 = " + number2);


    }
}
