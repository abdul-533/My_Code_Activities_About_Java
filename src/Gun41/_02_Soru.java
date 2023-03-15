package Gun41;

import MyFunction.MyFunction;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _02_Soru {
    //canli digital saaat yapiniz
    public static void main(String[] args) {

        while (true) {
            DateTimeFormatter f = DateTimeFormatter.ofPattern("kk:mm:ss");
            LocalTime saat = LocalTime.now();
            System.out.print("s\r " + saat.format(f));
            MyFunction.Bekle(1);
        }

    }
}
