package Gun40;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class _01_JavaLocalDate {
    public static void main(String[] args) {

        //LocalDate Sadecegun ay yil bilgisini tutar

        LocalDate tarish=LocalDate.now();
        System.out.println("tarish = " + tarish);
        System.out.println("tarish.getYear() = " + tarish.getYear());
        System.out.println("tarish.getMonth() = " + tarish.getMonth());
        System.out.println("tarish.getMonthValue() = " + tarish.getMonthValue());
        System.out.println("tarish.getDayOfMonth() = " + tarish.getDayOfMonth());
        System.out.println("tarish.getDayOfWeek() = " + tarish.getDayOfWeek());
        System.out.println("tarish.getDayOfYear() = " + tarish.getDayOfYear());
        System.out.println("tarish.getDayOfWeek().getValue() = " + tarish.getDayOfWeek().getValue());
        System.out.println("tarish.getChronology() = " + tarish.getChronology());
        System.out.println("tarish.getEra() = " + tarish.getEra());


        // Formatlat kendisinde olan hazir formatlar.
        System.out.println("ISo_Date="+tarish.format(DateTimeFormatter.ISO_DATE));
        System.out.println("tSHORT  = " + tarish.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("MEDIUM)) = " + tarish.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("LONG)) = " + tarish.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("FULL)) = " + tarish.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        // alinan saatin bashka ulkeye gore gosterilmesi


        System.out.println("*************************************");
        System.out.println("FULL Almanya gosterimi=\n"+
                tarish.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMAN)));

        System.out.println("**********************************");
        //Lokalizasyon tanimlamasi
        //En-US :birincisi dili ikincisi ise Ulkeyi temsil eder(Localization)Bu Amerikan ingilizcesi demek
        //En-UK : UK ingilizcesi
        //Fr-CA : Kanada fransizcasi
        //en-CA :
        //tr-TR: bu birtane diye bu halde olur
        // bazi ulkere yok o bu usulla bulunur
        Locale[] kullanilabilirLokaller=Locale.getAvailableLocales();
        for(Locale l:kullanilabilirLokaller) {

            if (l.getDisplayCountry().toLowerCase().contains("chi")) {
                System.out.print("Language = " + l.getDisplayLanguage());
                System.out.print("Country = " + l.getDisplayCountry());
                System.out.print(", = " + l.getLanguage());
                System.out.println(",  = " + l.getCountry());
            }
        }
        Locale lokalChince=new Locale("zh","CN");
        System.out.println("Ful Cince gosteri = \n"+
              tarish.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(lokalChince)));
        System.out.println("Extra="+tarish.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.CHINA)));




        // kendimiz tarish vericez istediyimiz gibi
        System.out.println("tarish = " + tarish);  //simdiki hali
        DateTimeFormatter ozelFormat1=DateTimeFormatter.ofPattern("dd/MM/YYY");
        System.out.println("ozelFormat1 = " + tarish.format(ozelFormat1));

        DateTimeFormatter oz2=  DateTimeFormatter.ofPattern("d.M.yy");
        System.out.println("tarish.format(oz2) = " + tarish.format(oz2));

        DateTimeFormatter oz3=DateTimeFormatter.ofPattern("EEEE dd.MM.yyyy");
        System.out.println("tarish = " + tarish.format(oz3));
        DateTimeFormatter oz4=DateTimeFormatter.ofPattern("EE dd.MM.yyyy");
        System.out.println("tarish = " + tarish.format(oz4));

        System.out.println("tarish = " + tarish.format(oz3.withLocale(Locale.UK)));

        DateTimeFormatter oz5=DateTimeFormatter.ofPattern("MMM dd.MM.yyyy");
        System.out.println("tarish = " + tarish.format(oz5));
        System.out.println("\n***************");
        //Kendimiz bir tarihi nasıl set edebiliriz, oluşturabiliriz, int sayi=5

        LocalDate tarih1= LocalDate.of(2000,5,20);
        LocalDate tarih2= LocalDate.of(1999, Month.MARCH, 12);
        System.out.println("tarih2.format(ozelFormat1) = " + tarih2.format(ozelFormat1));









    }
}
