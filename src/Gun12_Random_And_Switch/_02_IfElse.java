package Gun12_Random_And_Switch;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        // After getting the 2 integers entered from the user,
        // A for addition, S for subtraction, M for multiplication, D for division
        // take the letters of  and perform the appropriate operation  print the result.

        Scanner scan = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);
        System.out.println("Write number1=");
        int number1 = scan.nextInt();
        System.out.println("Write number2=");
        int number2 = scan.nextInt();

        System.out.println("If you want to add write A,  to subtract  write S, to multiplicat write M and to division write D= ");
        String writing = scanStr.nextLine();

        if (writing.equals("A"))
            System.out.println("Result=" + (number1 + number2));
        else if (writing.equals("S"))
            System.out.println("Result=" + (number1 - number2));
        else if (writing.equals("M"))
            System.out.println("Result=" + (number1 * number2));
        else if (writing.equals("D"))
            System.out.println("Result=" + (double) (number1 / number2));


    }
}
