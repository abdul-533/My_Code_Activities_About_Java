package Gun14_ForLoop_and_Cantinue;

import java.util.Scanner;

public class _01_Break {
    public static void main(String[] args) {
        //BREAK
        ////A given number is the product of two identical numbers.
        //  find if they are equal
        //Example = 4- -> this is perfect square 2*2
        //Example =5 ->this is not a perfect square
        //Example 9=-> 3*3

        Scanner scan = new Scanner(System.in);
        System.out.println("Write number=");
        int number = scan.nextInt();

        int counter = 0;
        boolean PerSquare = false;
        // int arananRakam=0; 2-ci yontem


        while (counter < number) {
            if (counter * counter == number) {
                System.out.print("Perfect square: "+counter+"x"+counter);
                PerSquare = true;
                break;
            }

            counter++;

        }
        if (PerSquare == false)
            System.out.println("Isn't perfect square");


    }
}
