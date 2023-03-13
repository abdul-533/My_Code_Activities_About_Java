package Gun39._01_OOP_Soru;

public abstract class Hayvan {
    private final int id;
    private String isim;
    private Boolean vahsi;
    private String DogumTarihi;

    private static int IdSayac = 1;

    abstract void Yiyeceyi();

    abstract void Yemekmiktari();

    abstract void GunlukUykuSuresi();

    abstract void Sesi();


    @Override
    public String toString() {
        // kendisi yapsin
        System.out.println("Yiyeceyi: ");
        Yiyeceyi();
        System.out.println("Yemek Miktari: ");
        Yemekmiktari();
        System.out.println("Uyku suresi: ");
        GunlukUykuSuresi();
        System.out.println("Sesi: ");
        Sesi();
        return "Hayvan{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", vahsi=" + vahsi +
                ", DogumTarihi='" + DogumTarihi + '\'' +
                '}';
    }

    public Hayvan(String isim, Boolean vahsi, String dogumTarihi) {
        this.id = IdSayac++;
        setIsim(isim);
        setVahsi(vahsi);
        setDogumTarihi(dogumTarihi);


    }

    public int getId() {
        return id;
    }


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public Boolean getVahsi() {
        return vahsi;
    }

    public void setVahsi(Boolean vahsi) {
        this.vahsi = vahsi;
    }

    public String getDogumTarihi() {
        return DogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        DogumTarihi = dogumTarihi;
    }

    public static void setIdSayac(int idSayac) {
        IdSayac = idSayac;
    }
}
