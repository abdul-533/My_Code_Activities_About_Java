package Gun31_Enum._03_Erum;

public enum Settings {
    JANUARY1(1, 31, "January"),
    FEBRUARY(2, 28, "February"),
    MARCH(3, 31, "March"),
    APRIL(4, 30, "April"),
    MAY(5, 31, "May"),
    JUNE(6, 30, "June"),
    JULY(7, 31, "July"),
    AUGUST(8, 30, "August"),
    SEPTEMBER(9, 30, "September"),
    OCTOBER(10, 31, "October"),
    NOVEMBER(11, 30, "November"),
    DECEMBER(12, 31, "December");

    final int monthNo;
    final int daysQuantity;
    final String name;

    Settings(int monthNo, int daysQuantity, String name) {
        this.monthNo = monthNo;
        this.daysQuantity = daysQuantity;
        this.name = name;
    }
}
