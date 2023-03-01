package Gun30_Veriables._02_FinalVariables.Example2;

import java.util.Scanner;

public class Question {
    // Constantly in a Class named Constants
    // the number of hours in a day, the number of minutes in an hour, and
    // define the number of seconds in a minute.
    // in main, taking days, hours, minutes from the user, total
    // find the second


    public static void main(String[] args) {
        int day = 0;
        int hour = 0;
        int minute = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Day=");
        day = scan.nextInt();
        System.out.print("Hour=");
        hour = scan.nextInt();
        System.out.println("Minute=");
        minute = scan.nextInt();
        Constants cb = new Constants();
        int totalMinute = day * Constants.aNumberofHoursperDay * Constants.NumberofMinutesinanHour * Constants.oneSecondsperMinute +
                hour * Constants.NumberofMinutesinanHour * Constants.oneSecondsperMinute +
                minute * Constants.oneSecondsperMinute;
        System.out.println("Total Minute = " + totalMinute);

        //Second Way
        System.out.println("Total Minute = " + Constants.byCount(day, hour, minute));


    }
}
