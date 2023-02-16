package Gun20_java_Methods;

import java.util.Scanner;

public class _03_JavaMethod {
    public static void main(String[] args) {

//Question: Product of numbers up to a number entered by the user (factorial)
// find it in a function and print its result in main whether it is odd or couple.
        Scanner scan = new Scanner(System.in);

        System.out.println("Write number=");
        int number = scan.nextInt();

        int mPlica = faktoryel(number);

        if (mPlica % 2 != 0)
            System.out.println("Is odd");
        else
            System.out.println("Is couple");


    }

    public static int faktoryel(int number) {
        int mplica = 1;
        for (int i = 1; i < number; i++) {
            mplica = mplica * i;
        }

        return mplica;
    }

}
