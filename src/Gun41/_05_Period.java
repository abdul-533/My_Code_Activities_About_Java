package Gun41;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class _05_Period {
    //Iki tarix arsindaki ferqi gosterir sadece localDateler ucun uistifade edilir
    public static void main(String[] args) {
        LocalDate dogumTarixi = LocalDate.of(1997, 04, 14);
        LocalDate bugun = LocalDate.now();

        Period fark = Period.between(dogumTarixi, bugun);
        System.out.println("fark = " + fark);

        System.out.println("fark.getDays() = " + fark.getDays());
        System.out.println("fark.getMonths() = " + fark.getMonths());
        System.out.println("fark.getYears() = " + fark.getYears());

        System.out.println(fark.getYears() + " Yashindayiz");
//*******************************************************

        // kendimiz period ilave ede biliriz
        Period period3Gun = Period.ofDays(3);
        Period period3Ay = Period.ofMonths(3);

        System.out.println("period3Gun = " + period3Gun);
        System.out.println("period3Ay = " + period3Ay);

        LocalDate ucgunSonra = bugun.plus(period3Gun);
        System.out.println("ucgunSonra = " + ucgunSonra);

        LocalDate ucaySonda = bugun.plus(period3Ay);
        System.out.println("ucaySonda = " + ucaySonda);

        //****************************************
        // kursun bashlama ve bitme gunleri
        
        Period altiAySonra=Period.ofMonths(6);
        LocalDate kursBashlangic=LocalDate.of(2022,10,31);
        System.out.println("Kurs Sonu= " + kursBashlangic.plus(altiAySonra));

        Period neKadarSureKAldiBitmeyine=Period.between(bugun,kursBashlangic.plus(altiAySonra));
        System.out.println("neKadarSureKAldiBitmeyine = " + neKadarSureKAldiBitmeyine);
        // kurs ne zamandir davam edir

        Period BuVaxtaKimidavamSuresi=Period.between(kursBashlangic,bugun);
        System.out.println("BuVaxtaKimidavamSuresi = " + BuVaxtaKimidavamSuresi);



        

    }
}
