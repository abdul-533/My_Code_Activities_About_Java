package Gun42;

import java.util.Arrays;

public class _02_JavaVeriTipleri {
    public static void main(String[] args) {

        // bilgisayarda bunlari tutmak icin ramda iki bolde yaradilib
        //  adilari 1- deyerlerin olduqu yer 2- isimlerin olduqu yer
        //   *************************************************
        // ilker (primitive) tipler:  short, byte, long, double, float, boolean

        int sayi1 = 5;
        int sayi2 = 10;

        sayi1 = sayi2; // sayi1=10;            // esitlenen deyerler atani hucreleri
        sayi1 = 34;                          // yine ayri-ayri kalir;
        sayi2 = 45;
        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);


        //Refeerans tipler:  dizi , array, classlar, nesneler
        int[] dizi1 = {1, 2, 3, 4};
        int[] dizi2 = {5, 6};
        System.out.println("dizi1 = " + Arrays.toString(dizi1));
        System.out.println("dizi2 = " + Arrays.toString(dizi2));

        dizi1 = dizi2;
        System.out.println("dizi1 = " + Arrays.toString(dizi1));  //5,6
        System.out.println("dizi2 = " + Arrays.toString(dizi2)); //5,6

        // bunu nasil anlariz
        dizi1[0] = 67; // sadece ilkini deyishtirdik demekki ikiside ayri yeri gosterir
        System.out.println("dizi1 = " + Arrays.toString(dizi1)); //67,6
        System.out.println("dizi2 = " + Arrays.toString(dizi2));  //67,6

        dizi2[0] = 55;   // simdi dizi ikiyi deyishtirerek bakalim yine ikiside ayni yeri gostericek
        System.out.println("dizi1 = " + Arrays.toString(dizi1));
        System.out.println("dizi2 = " + Arrays.toString(dizi2));


        // NESNE Tipler yani null ala bilen ilker tip arada olan bir sey
        // String ,Integer, Double (buyuk harfle olanlar)
        // referans gibi gorukmesine raqmen ilker gibi davranir
        //ISBATI
        String ad1 = "Mehmet";
        String ad2 = "Ismet";
        ad1 = ad2;
        System.out.println("ad1 = " + ad1);
        System.out.println("ad2 = " + ad2);

        // farkli kutularda ayni deyerleri alirlar
        ad1 = "Ali";
        System.out.println("ad1 = " + ad1);
        System.out.println("ad2 = " + ad2);








    }
}
