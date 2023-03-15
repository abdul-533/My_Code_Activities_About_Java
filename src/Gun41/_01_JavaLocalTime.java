package Gun41;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _01_JavaLocalTime {
    public static void main(String[] args) {
        //Local time tarih bilgisi icermez sadece saat, dakika saniye ve nano saniye icerir
        LocalTime saat=LocalTime.now();
        System.out.println("saat = " + saat);

        System.out.println("saat.getHour() = " + saat.getHour());
        System.out.println("saat.getMinute() = " + saat.getMinute());
        System.out.println("saat.getSecond() = " + saat.getSecond());
        System.out.println("saat.getNano() = " + saat.getNano());

        // kendimize ozel format vericez

        DateTimeFormatter of1=DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println("saat = " + saat.format(of1));

        DateTimeFormatter of2=DateTimeFormatter.ofPattern("kk:mm");
        System.out.println("saat = " + saat.format(of2));

        DateTimeFormatter of3=DateTimeFormatter.ofPattern("K:mm ");
        System.out.println("saat = " + saat.format(of3));
        
        //*************************************8
        
        LocalTime saat1=LocalTime.of(7,34,45);
        System.out.println("saat1.format(of3) = " + saat1.format(of3));


    }
}
