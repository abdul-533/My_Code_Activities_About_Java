package Day10_About_If_Else;

import java.util.Scanner;

public class _08_IfElse {
    public static void main(String[] args) {
        // The number of 3 int numbers entered side by side with a space between them
        // find whether the result of their sum is odd or even
        //Example: 45 67 123
        Scanner scan = new Scanner(System.in);
        System.out.println("Write number: ");
        String numbers = scan.nextLine();
        int spaceIndex1 = numbers.indexOf(" ");
        int spaceIndex2 = numbers.indexOf(" ", (spaceIndex1+1));
        int number1 = Integer.parseInt(numbers.substring(0, spaceIndex1));
        int number2 = Integer.parseInt(numbers.substring((spaceIndex1 + 1), spaceIndex2));
        int number3 = Integer.parseInt(numbers.substring(spaceIndex2 + 1));
        int sum = number1 + number2 + number3;

        if (sum % 2 != 0)
            System.out.print("Sum is odd");
        else
            System.out.print("Sum is even");


    }
}
