package Gun37._02_OrnekSoru;

public class Duck extends TemelHayvan  implements ISailing,IFlying{

    public Duck(String turu, String mizach, String genelRengi, double genelKilosu) {
        super(turu, mizach, genelRengi, genelKilosu);
    }

    @Override
    public String food() {
        return "Ot yiyor";
    }

    @Override
    public String Ucucu() {
        return "Bazi cincleri ucuyor";
    }

    @Override
    public String Yuzucu() {
        return "Genelde suda uzerler";
    }
}
