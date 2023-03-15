package Gun41;

import java.time.LocalDate;

public class _08_ComparingDateandTime {
    public static void main(String[] args) {


        LocalDate bugun=LocalDate.now();
        LocalDate dun=bugun.minusDays(1);

        bugun.isAfter(dun);// bu gun dunden sonrami
        boolean  sonrami=bugun.isAfter(dun); // bu gun dunden sonrami?
        System.out.println("sonrami = " + sonrami);

        boolean oncemi=bugun.isBefore(dun); //bu gun dunden oncemi?
        System.out.println("oncemi = " + oncemi);

        boolean esitmi=bugun.isEqual(dun);// bu gun fune esitmi
        System.out.println("esitmi = " + esitmi);

        boolean artikilmi=bugun.isLeapYear(); // bu gun artik yilmi
        System.out.println("artikilmi = " + artikilmi);

    }
}
