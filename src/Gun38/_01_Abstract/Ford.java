package Gun38._01_Abstract;

public class Ford extends BinekOtu {

    public Ford(String marka, int uretimYili, int vites) {
        super(marka, uretimYili, vites);
    }

    @Override
    public int hizlanmaSuresi() {
        return 0;
    }
}
