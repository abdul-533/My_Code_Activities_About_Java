package Gun11_If_and_Ternary;

import java.util.Scanner;

public class _07_javaMath {
    public static void main(String[] args) {
        //  Find the largest of the 3 numbers entered with the Math.max method
        Scanner scan = new Scanner(System.in);
        System.out.println("Write first number=");
        int number1 = scan.nextInt();
        System.out.println("Write second number=");
        int number2 = scan.nextInt();
        System.out.println("Write third number=");
        int number3 = scan.nextInt();

        int maxNum = Math.max(number3, (Math.max(number1, number2)));
        System.out.println("Max Number is = " + maxNum);

    }
}
