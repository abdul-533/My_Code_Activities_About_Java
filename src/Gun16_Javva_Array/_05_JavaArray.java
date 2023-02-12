package Gun16_Javva_Array;

public class _05_JavaArray {
    public static void main(String[] args) {
        // Question: You filled 5 tv channel names into a series.
        // Then choose one randomly and print the selected one on the screen.

        String[] arrayTV = {"AmericanTV", "Show", "BBC", "Sinama+", "Musics",};

        for (int i = 0; i < 5; i++) {
            int rabdom = (int) (Math.random() * arrayTV.length);
            System.out.println("Random chosen=" + arrayTV[rabdom]);
        }


/**********************************************************************************************************************/
        System.out.println("************************************TODO : Question: **********************************************************\n");
        // TODO : Question:
        // Find 5 TV with a loop  but don't find what It found again
        int counter = 5;
        while (counter > 0) {
            int rnd = (int) (Math.random() * arrayTV.length);
            if (arrayTV[rnd] != null) {
                System.out.println(arrayTV[rnd]);
                arrayTV[rnd] = null;
                counter -= 1;
            }
        }


    }
}
