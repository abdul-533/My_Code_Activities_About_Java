package Gun42;

public class _01_StringBufferAndStringBuilder {
    public static void main(String[] args) {
        String cumle = "";

        cumle = cumle + "Bu gun"; // +isareti stringlerde birlehdirme yapar
        cumle = cumle + "hava";
        cumle += "cok soguk";


        System.out.println("cumle = " + cumle);
        System.out.println("cumle.concat = " + cumle.concat("fakat dun soqukdu"));

        System.out.println("cumle = " + cumle);  // cumlenin kendisi deyishmez
        cumle = cumle.concat("Fakat dun sicakdi");  // boyle olursa kendisi deyisheir (concanta birlehdirme atama ister)
        System.out.println("cumle = " + cumle);

        // bu ishlemler bilgisayari cok yorduqu icin (buyuk ishlemlerde)
        // bu durum icin javada ozel sinif olushdurulmush cok hizli calishir
        //bunun ismi StringBuilder demishler

        // *******STRING BUILDER********

        StringBuilder cumle2 = new StringBuilder();
        cumle2.append("Bu gun "); // append : ekle demek atama gerektirmez direk ekler
        cumle2.append(" hava ");
        cumle2.append(" Soguk ");
        System.out.println("cumle2 = " + cumle2);

        //************3 modelin hizi test edilecek*********************8
        // +, concat< StringBuilder--->

        long startTime = System.currentTimeMillis();
        String test1 = "";

        for (int i = 0; i < 10000; i++)
            test1 = test1 + " merhaba";

        System.out.println("+ icin sure=" + (System.currentTimeMillis() - startTime) + " ms");
        startTime = System.currentTimeMillis();
        String test2 = "";
        for (int i = 0; i < 10000; i++) {
            test2 = test2.concat(" merhaba");

        }
        System.out.println("+ concat icin sure=" + (System.currentTimeMillis() - startTime) + " ms");

        startTime = System.currentTimeMillis();
        StringBuilder test3 = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            test3.append(" merhaba"); // kendisi zaten esitler
        }
        System.out.println(" String builder sure=" + (System.currentTimeMillis() - startTime));
        // test edildi builder daha hizli... test pass

        // Performans testi sonucu :
        // eğer 3 kadar ekleme işlemi olacaksa + kullanılır, pratik olduğu için
        // ancak daha fazla ekleme olacaksa 10 adede kadar concat kullanılabilir
        // Eğer çok fazla String işlemleri yapacaksak bunun için
        // performansı oldukça iyi olan StringBuilder kullanılır.
        // yapısı gereği hızlı çalışır.

        System.out.println("**********************************************\n\n");
        //*************************************************************
        StringBuilder sb = new StringBuilder();
        sb.append("Bugun "); // kendine ekleme atama gerektirmez, concatda gerekirdi
        sb.append("Hava ");
        sb.append("Guzel ");
        System.out.println("sb = " + sb);
        System.out.println("sb.length() = " + sb.length());
        sb.append(4); // eklenen her seyi to string hali var ise cevirerek ekler
        System.out.println("sb = " + sb);

        sb.reverse(); // stringi tersine cevirir
        System.out.println("sb = " + sb);
        sb.reverse(); // tekrara duzeltdik
        System.out.println("sb = " + sb);

        sb.delete(0, 5); // 0 dahil, 5 haric olmak uzere siler
        System.out.println("sb = " + sb);

        sb.deleteCharAt(3); // sadece belirrtilen indexteki karakteri siler
        System.out.println("sb = " + sb);

        sb.insert(5, "Kelime "); // 5 nolu indexe kelimeyi ekle
        System.out.println("sb = " + sb);
        sb.insert(0, "Bugun "); // 0 nolu indexe ekleme yapdi
        System.out.println("sb = " + sb); // extra olarak

        sb = new StringBuilder("Bu gun hava cok soguk"); // o landi (yenilendi) ve ilk deyer atandi
        System.out.println("sb = " + sb);

        sb.replace(3, 8, "Bu"); // verilen araliqi bu stringle deyishtir orayi siler bunu yazar
        System.out.println("sb = " + sb);

        String string = sb.toString(); // bunla stringe cevirer
        System.out.println("string = " + string);

        // string builder gibi birtane Stringbuffer var her seyi ayni deyishen bir sey yok,
        // tek farki: sadece parale calishmalarda ku;llanilan ozelliyi var
        // onu testing toollarda gorucez
        // ilk once Buffer yazilmish sonra Builder
        StringBuffer sBuffer = new StringBuffer();

    }
}
