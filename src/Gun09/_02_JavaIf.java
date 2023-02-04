package Gun09;

import java.util.Scanner;

public class _02_JavaIf {
    public static void main(String[] args) {
        //Question: Print whether an entered number is negative or positive
        // if zero, print zero
        Scanner scan = new Scanner(System.in);
        System.out.print("Write number=");
        int number = scan.nextInt();

        if (number > 0)
            System.out.println("pilus");
        if (number< 0)
            System.out.println("minus");
        if (number == 0)
            System.out.println("zero");


    }
}
