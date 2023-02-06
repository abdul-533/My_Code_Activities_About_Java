package Day10_About_If_Else;

import java.util.Scanner;
import java.util.SortedMap;

public class _07_IfElse {
    public static void main(String[] args) {
        // Number of 2 int numbers entered side by side with a space between them
        // find if they are equal to each other
        // Example: 45 45
        Scanner scan = new Scanner(System.in);
        System.out.println("Write the number= ");
        String number = scan.nextLine();

        int spaceIndex = number.indexOf(" ");

        int number1 = Integer.parseInt(number.substring(0, spaceIndex));
        int number2 = Integer.parseInt(number.substring(spaceIndex + 1));


        if (number1 == number2)
            System.out.println("Equal");
        else
            System.out.println("Not Equal");


    }
}
