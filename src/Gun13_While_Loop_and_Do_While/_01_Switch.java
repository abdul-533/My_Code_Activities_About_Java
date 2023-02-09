package Gun13_While_Loop_and_Do_While;

import java.util.Scanner;

public class _01_Switch {
    public static void main(String[] args) {
        //Print, how many days the month lasts according to the entered month number.
        Scanner scan=new Scanner(System.in);
        System.out.println("Write a number of month=");
        int number=scan.nextInt();

        switch (number) {
            case 1: System.out.println("31 days"); break;
            case 2: System.out.println("28/29 days"); break;
            case 3: System.out.println("31 days"); break;
            case 4: System.out.println("30 days"); break;
            case 5: System.out.println("31 days"); break;
            case 6: System.out.println("30 days"); break;
            case 7: System.out.println("31 days"); break;
            case 8: System.out.println("31 days"); break;
            case 9: System.out.println("30 days"); break;
            case 10: System.out.println("31 days"); break;
            case 11: System.out.println("30 days"); break;
            case 12: System.out.println("31 days"); break;
            default: System.out.println("Please try again, your includen number is wrong you can include between 1-12");

        }
        /////////////////////////Second Way///////////////////////
        switch (number) {
            case 1:// these points are the same there for we use this way
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: System.out.println("31 days"); break;
            case 2: System.out.println("28/29 days"); break;
            case 4:
            case 6:
            case 9:
            case 11: System.out.println("30 days"); break;
            default: System.out.println("Please try again, your includen number is wrong you can include between 1-12");

        }



    }
}
