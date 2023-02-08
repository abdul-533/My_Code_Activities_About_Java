package Gun12_Random_And_Switch;

import java.util.Scanner;

public class _04_Switch {
    public static void main(String[] args) {
        // Same easy way as Switch-if
        // Print the user's day name that matches the day number of the input

       Scanner scan=new Scanner(System.in);
        System.out.println("Write  number of the day=");
       int dayNo=scan.nextInt();

        switch (dayNo){
            case 1 : System.out.println("Monday");break; // brake-> get out of the switch, don't get down
            case 2: System.out.println("Tuesday");break;
            case 3: System.out.println("Wednesday");break;
            case 4: System.out.println("Thursday ");break;
            case 5: System.out.println("Friday");break;
            case 6: System.out.println("Saturday");break;
            case 7: System.out.println("Sunday");break;
            default:System.out.println("Incorrect number");
        }





    }
}
