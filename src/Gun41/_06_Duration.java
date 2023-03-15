package Gun41;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _06_Duration {
    public static void main(String[] args) {
        // Duration: hem LocalTime hemde LcalDateTime arasindaki farki verir

        //LocalTime

        LocalTime dersBashlanqic = LocalTime.of(19, 0, 0);
        LocalTime dersBitish = LocalTime.of(22, 0, 0);
        Duration GunlukDersSuresi = Duration.between(dersBashlanqic, dersBitish);
        System.out.println("GunlukDersSuresi = " + GunlukDersSuresi);

        System.out.println("GunlukDersSuresi.toHours() = " + GunlukDersSuresi.toHours());//toplam saat hali
        System.out.println("GunlukDersSuresi.toMinutes() = " + GunlukDersSuresi.toMinutes());//toplam dakka hali
        System.out.println("GunlukDersSuresi.toMillis() = " + GunlukDersSuresi.toMillis());

        // LocalDateTime

        LocalDateTime from=LocalDateTime.of(2023,1,1,0,0);
        LocalDateTime to=LocalDateTime.now();

        Duration fark=Duration.between(from,to);
        System.out.println("fark = " + fark);
        System.out.println("fark.= " + fark.toDays()+"\t"+fark.toHours()+"\t"+fark.toMinutes());



    }

}
