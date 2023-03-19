package Gun43;

public class _05_TryCatchFinaly {
    public static void main(String[] args) {

        long starttime = 0;
        String str = "";

        try {
            starttime = System.currentTimeMillis();
            System.out.println("Hatadan onceki kisim");
            char ilkharf = str.charAt(0);
            System.out.println("Hatadan sonraki kisim");
            // hata olma olasiliqinin olduqu kodlar


        } catch (Exception ex) {
            System.out.println("catch blogu calishdi");
            // hata olduqunda yapilacaklar

        } finally // hata olsada olmasada calishicak kisim fark etmez bu bolum
        // yukardaki ile ilgili olduqunu gostermek icin yapilir
        {
            long gecenSure = System.currentTimeMillis() - starttime;
            System.out.println("gecenSure = " + gecenSure);
            System.out.println("try catch blogu ile ilgili son yapilacaklar");

        }

        System.out.println("Diget calsohan kodlar");

        System.out.println("program sonu");


    }
}
