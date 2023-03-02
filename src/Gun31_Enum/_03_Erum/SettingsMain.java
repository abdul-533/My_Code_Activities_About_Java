package Gun31_Enum._03_Erum;

public class SettingsMain {
    public static void main(String[] args) {
        System.out.println("Month.August = " + Settings.AUGUST);

        // need method how many days the month lasts
        // Turkish spelling of the month requires a method
        // the actual serial number of the month method is required

        // Java says this way a single word or
        // if they're going to have numbers that are numbers, it's a convenience to you.


        Settings month = Settings.AUGUST;

        System.out.println("Month = " + month);
        System.out.println("Month No = " + month.monthNo);
        System.out.println("Month days quantity = " + month.daysQuantity);
        System.out.println("Month name = " + month.name);


        for (Settings a : Settings.values())
            System.out.println(a.monthNo + ": " + a.daysQuantity + "- " + a.name);


    }
}
