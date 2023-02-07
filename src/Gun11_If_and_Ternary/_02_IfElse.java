package Gun11_If_and_Ternary;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        // Parking fees:
        // 10 TL up to 3 hours, 15 TL up to 5 hours, 20 TL up to 5 hours.
        // print the price by taking the number of hours left from the user

        Scanner scan = new Scanner(System.in);
        System.out.println("Write your parking time=");
        int stayHour = scan.nextInt();

        if (stayHour <= 3)
            System.out.println("Pay 10 TL");
        else if (stayHour <= 5)
            System.out.println("Pay 15 TL");
        else
            System.out.println("Pay 20 TL");


    }
}
