package Gun42;

import java.util.Arrays;

public class _03_VeriTiplerMetodlarda {
    public static void main(String[] args) {
        // ilker tip
        int sayi = 5;
        sayiArtir(sayi);
        System.out.println("sayi = " + sayi); // buraya 5 yazicak

        //Referans tiplerde
        int[] dizi = {1, 2, 3};
        diziSifirla(dizi);
        System.out.println("dizi = " + Arrays.toString(dizi)); //0, 0 ,0

        //Nesne tiplerde nasil olur
        String kelime="Ismet";
        kelimeSifirla(kelime);
        System.out.println("kelime = " + kelime); // ismet yazar

        //OZET:*********************************
        // Özet: Temel fark:
        // 1- İlkel tipler sadece 1 değer saklarlar, bu yüzden metodlara sadece değeri gider.Eşitlendiğinde sadece değer aktarılır.
        // 2- Nesne tipler İlkel tipten tek farkı NULL değeri alabilmeleri, bu yüzden ilkel tip gibi davranırlar
        // 3- Referans tipler metoda gönderildiklerinde kendileri giderler. Eşitlemelerde referanslar eşitlenir.


    }

    public static void sayiArtir(int sayi) { // ilker deyerlerin deyeri gelir (rakam olarak)
        sayi++; //6.
        //ilker tiplerde kendisi gelmez deyeri gelir

    }

    public static void diziSifirla(int[] dizi) { // burada metoda referans deyerlerin kendisi gelir
        dizi[0] = 0;
        dizi[1] = 0;
        dizi[2] = 0;
        // Rferans tiplerde ise kendisi gelir.

    }
    public static void kelimeSifirla(String kelime){ // deyeri gelir
        kelime="";
    }

}
