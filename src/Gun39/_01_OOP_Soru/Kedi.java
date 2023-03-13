package Gun39._01_OOP_Soru;

public class Kedi extends Hayvan{

    public Kedi( String isim, Boolean vahsi, String dogumTarihi) {
        super( isim, vahsi, dogumTarihi);





    }



    @Override
    void Yiyeceyi() {
        System.out.println("Kedi Yemi Yiyor");

    }

    @Override
    void Yemekmiktari() {
        System.out.println("100-200 qram kadar yer");

    }

    @Override
    void GunlukUykuSuresi() {
        System.out.println("Genelde soyuk havalarda 10-15 saaat kadar yatar");

    }

    @Override
    void Sesi() {
        System.out.println("Meow -meow eder...");

    }

}
