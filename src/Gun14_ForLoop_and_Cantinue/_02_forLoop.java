package Gun14_ForLoop_and_Cantinue;

public class _02_forLoop {
    public static void main(String[] args) {
        // Print the numbers from 1 to 5 to the screen.
        //if it is clear how long a loop will spin - use for  ,
        // If the start and the end are clear and that's  not clear that how many steps it will take,

        int i = 1;
        while ((i <= 5)) {
            System.out.println("While= " + i);
            i++;
        }
        System.out.println();
        for (i = 1; i <= 5; i++) {
            System.out.println("For= " + i);
        }


    }
}
