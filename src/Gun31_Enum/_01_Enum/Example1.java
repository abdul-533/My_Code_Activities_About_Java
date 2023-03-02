package Gun31_Enum._01_Enum;

public class Example1 {
    public static void main(String[] args) {


        // According to a given month number, the number of days of the month
        // write the output program

        int monthNo=5;

        switch (monthNo){
            case 2: System.out.println(28); break;
            case 1: //January
            case 3: // March
            case 5: // May
            case 22:
            case 10:
            case 12: System.out.println(31); break;
            case 4:
            case 6:
            case 9:
            case 11: System.out.println(30); break;
        }


        String monthName="May";
        switch (monthName){
            case "February": System.out.println(28); break;
            case "January":
            case "March":
            case "August":
            case "June":
            case "December":System.out.println(31); break;
            case "April":
            case "July":
            case "September":
            case "October":
            case "NOVEMBER": System.out.println(30); break;
        }



    }
}
