package Gun43;

import java.util.Scanner;

public class _02_JAvaRuntimeException {
    public static void main(String[] args) {

        System.out.println("Program bashladi");

        try { // hata bolgesini try{} icine aldik
        Scanner oku = new Scanner(System.in);


        System.out.println("Sayi1=");
        int sayi1 = oku.nextInt();

        System.out.println("Sayi2=");
        int sayi2 = oku.nextInt();


        int bolum = sayi1 / sayi2;
        System.out.println("bolum = " + bolum);
        }
        catch (Exception hata){
            // hata mesalarini hata isimli Exception cinsinden deyishkene atdim
            System.out.println("hata = " + hata.getMessage());
            System.out.println("lutfen tekrara deneyiniz");
        }
        System.out.println("Program bitdi");

    }
}
