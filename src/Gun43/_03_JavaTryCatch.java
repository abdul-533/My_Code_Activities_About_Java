package Gun43;

import java.time.LocalDate;
import java.time.Month;

public class _03_JavaTryCatch {
    public static void main(String[] args) {

        System.out.println("Program calishmaya bshladi");

        try {// deneme , hatanin bashladiqi yerin ustune kirar
            LocalDate tarih=LocalDate.of(2023, Month.FEBRUARY,30);
        }// hata olduqu zaman programi kirma
       catch (Exception ex)

       {   // ex isimli deyishkende olushan hatalrin bilgisini anlatir
           System.out.println("Hata olushdu lutfen tekrar dene");
           System.out.println("Tum hata mesajlari="+ex);
           System.out.println("HAta aciklamasi="+ex.getMessage());
           // kendin hata mesajini kendine mail ata bilirsin
           // log tutma: program nasil calishir, hata loglarini da yazabilirsin

       }
        System.out.println("Program bitdi");

        try {
            // Java ve Tollari calsihmaya devam et
            //Konulari oyrenmeye ve calishmaya devam
            // anlamadiqin yermi oldu? kirilmadan devam et
        }catch (Exception ex)
        {
            // hatanin sebebini anla
            //derse daha fazla odaklan
            // gereken videolari izle
            // qrup caloishmalari yap
            //oyren ve kirilmadan devam et
            // unutma sen bir soz verdin ve DEVAM

        }
        // sonunda seni guzel bir meslek bekliyor inshallah)

    }
}
