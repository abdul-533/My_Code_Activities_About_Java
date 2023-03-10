package Gun37._02_OrnekSoru;

public class Swallow extends TemelHayvan implements IFlying{


    public Swallow(String turu, String mizach, String genelRengi, double genelKilosu) {
        super(turu, mizach, genelRengi, genelKilosu);
    }

    @Override
    public String food() {
        return "Ot ve bazi cuculeri yerler";
    }

    @Override
    public String Ucucu() {
        return "Cok uzak yerlere kolayca uca bilirler zaten genelde ucarlar";
    }
}
