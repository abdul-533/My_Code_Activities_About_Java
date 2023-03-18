package Gun42;

public class _04_StringKarshilashtirmalar {
    public static void main(String[] args) {
        // stringlerde neden == yerine equal kullanilmakdadir
        String cumle1 = "BuGun Hava cok guzel";
        String cumle2 = "BuGun Hava cok guzel";

        // Ilker tipleri karshilashtirdiginda 2 sindede
        // DEYERLERI KARSILASHTIRIR
        //CUNKI bashka bir sey yok
        if (cumle1 == cumle2)
            System.out.println("Cumle bir cumle ikiye esit");
        else
            System.out.println("Esit deyil");

        if (cumle1.equals(cumle2))
            System.out.println("Cumle bir cumle ikiye esit");
        else
            System.out.println("Esit deyil");

        //********************REFERANS TIPLERDE ise durum*****************8
// scanf le almish gibi dushun, boyle scanf le ekrandan okuldugunda asqidaki gibi olur
        String cumle3 = new String("BuGun Hava cok guzel");
        String cumle4 = new String("BuGun Hava cok guzel");

        if (cumle3 == cumle4) // adresleri karshilastirir
            System.out.println("Cumle 3 cumle 4 esit");
        else
            System.out.println("Esit deyil!");

        if (cumle3.equals(cumle4)) // deyerleri aynimi
            System.out.println("Cumle 3 cumle 4 esit");
        else
            System.out.println("Esit deyil!!!");

        // Eguasl deyerlere bakar, == ise adreslere....


    }
}
