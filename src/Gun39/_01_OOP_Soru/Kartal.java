package Gun39._01_OOP_Soru;

public class Kartal extends Hayvan{
    public Kartal( String isim, Boolean vahsi, String dogumTarihi) {
        super( isim, vahsi, dogumTarihi);


    }

    @Override
    void Yiyeceyi() {
        System.out.println("Genelede etle beslenir");

    }

    @Override
    void Yemekmiktari() {
        System.out.println("Dag kartallari yaklsahik 20-30 kiloya kadar et yeye bilir");

    }

    @Override
    void GunlukUykuSuresi() {
        System.out.println("Geceleri uyur gunduzleri avlanir 10 saat kadar");

    }

    @Override
    void Sesi() {
        System.out.println("Zirvede Kaklarlar...");

    }
}
