package Gun43;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _04_JavaTryCatch {
    public static void main(String[] args) {

        System.out.println("Program bashladi");

        try {



            Scanner oku = new Scanner(System.in);


            System.out.println("Sayi1=");
            int sayi1 = oku.nextInt();

            System.out.println("Sayi2=");
            int sayi2 = oku.nextInt();


            int bolum = sayi1 / sayi2;
            System.out.println("bolum = " + bolum);
            String kelime="";
            kelime.charAt(3); // genel hataya dushmesi icin yapildi

        }
        catch (InputMismatchException ex)// en genel hata
        {
            System.out.println("Lutfen sayi giriniz");
        }

        catch (ArithmeticException ex)// belirli bir  hata
    {
        System.out.println("Sifira bolme Hatasi");
    }
        catch (Exception ex)//yukardakilarin disihinda bir hata iscin
        {
            System.out.println("Hata olsuhdu"+ex.getMessage());
        }


        System.out.println("Program bitdi");
    }
}
