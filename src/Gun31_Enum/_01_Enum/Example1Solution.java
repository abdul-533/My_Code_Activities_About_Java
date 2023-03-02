package Gun31_Enum._01_Enum;

public class Example1Solution {

    enum Month {
        Undefined, JANUARY, FEBRUARY, MARCH, APRIL, MAY,
        JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    }

    public static void main(String[] args) {
        Month month = Month.MAY;
        switch (month) {
            case FEBRUARY:
                System.out.println(" = " + 28);
                break;
            case JANUARY:
            case MARCH:
            case MAY:
            case JULY:
            case AUGUST:
            case OCTOBER:
            case DECEMBER:
                System.out.println("31 = " + 31);
                break;
            case APRIL:
            case JUNE:
            case NOVEMBER:
            case SEPTEMBER:
                System.out.println("30 = " + 30);
                break;

        }
        if (month == month.MAY) {

            System.out.println("Raise has been made");
        }

        System.out.println("Month = " + month); // toString
        System.out.println("Month.name() = " + month.name()); // word used as symbol
        System.out.println("Month.ordinal() = " + month.ordinal()); // Returns the index of the ICON

        for (Month a : Month.values())
            System.out.println("a.name()+a.ordinal() = " + a.name() + " ," + a.ordinal());

    }
    // Enum, enumeration and enum constants in software languages
    //  It's called //. Defined variables
    // is used to take a constant value. defined
    // these constant values form a group. access,
    // becomes easy to manage and understand.
    // a lot of data that needs to be entered at once
    // we enter in batch, use it later
    // also easy to write
}
