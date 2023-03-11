package Gun38._01_Abstract;

// 2 si bir arada olacaqsa bir interface ve bir parent class olacaqsa
// boyle yapa bilirsin/
public abstract class BinekOtu {
    private String marka;
    private int uretimYili;
    private int vites;

    public BinekOtu(String marka, int uretimYili, int vites) {
        setMarka(marka);
        setUretimYili(uretimYili);
        setVites(vites);

    }

    abstract int hizlanmaSuresi(); // boyle abstractla kullanilir

    //boyle olunca interface classina ihtiyac yok
    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getUretimYili() {
        return uretimYili;
    }

    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }

    public int getVites() {
        return vites;
    }

    public void setVites(int vites) {
        this.vites = vites;
    }


}
