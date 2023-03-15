package Gun41;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class _07_ZonedDataTime {
    public static void main(String[] args) {
        //Bashka Zaman bolgelesinin (TimeZone)
        // zaman bilgisini alma

        ZonedDateTime zdt=ZonedDateTime.now();
        // su anda vindonsun indiki default zamani verdi
        System.out.println("zdt = " + zdt);
        Set<String>zamanBolgeleri=ZoneId.getAvailableZoneIds();
        for (String z:zamanBolgeleri){

            if(z.toLowerCase().contains("ist"))
            System.out.println("z = " + z);

            if (z.toLowerCase().contains("baku"))
                System.out.println("z = " + z);
        }

        ZoneId zoneIStanbul=ZoneId.of("Europe/Istanbul");
        ZonedDateTime zonaIStanbul=ZonedDateTime.now(zoneIStanbul);
        System.out.println("zonaIStanbul = " + zonaIStanbul);






    }
}
