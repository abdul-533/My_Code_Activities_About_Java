package Gun19_Methods_Firs_Step;

import java.util.Scanner;

public class _04_JavaMethod {
    public static void main(String[] args) {
        isOddEvenCouple(55);
        isOddEvenCouple(60);
// Get the number from the user and print  if it odd or couple.
        printOddCouple();

    }

    public static void isOddEvenCouple(int sayi) {
        if (sayi % 2 != 0)
            System.out.println("odd");
        else
            System.out.println("couple");
    }

    public static void printOddCouple() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Write number= ");
        int number = scan.nextInt();

        isOddEvenCouple(number);

    }


}
