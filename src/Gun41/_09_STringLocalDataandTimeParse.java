package Gun41;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _09_STringLocalDataandTimeParse {
    public static void main(String[] args) {

        long startTime=System.currentTimeMillis(); // kodun performansi ucun
        System.out.println("startTime = " + startTime);


        // kullanicidan alinan ve string durumundaki time
        // ve ya tarih bilgisinin
        // time ve ya tarix bilgisine cevrilmesi

        Scanner oku=new Scanner(System.in);

        System.out.println("'tarix giriniz=");
        String STRtarix=oku.nextLine();
        // burda lainan bilginin lokal date timeye donushdurulmesi
        System.out.println("tarix = " + STRtarix);

        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd MM yyyy");
        // kullanicinin boylegirmesini isterim
        LocalDate tarih=LocalDate.parse(STRtarix,f);
        // burda bunu real tarixe donushdurduk
        System.out.println("tarih = " + tarih);

        long finishTime=System.currentTimeMillis();
        System.out.println("gecen sure = " + (finishTime-startTime)+" ms");

    }
}
