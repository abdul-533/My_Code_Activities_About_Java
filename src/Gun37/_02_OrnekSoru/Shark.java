package Gun37._02_OrnekSoru;

public class Shark  extends TemelHayvan implements ISailing{


    public Shark(String turu, String mizach, String genelRengi, double genelKilosu) {
        super(turu, mizach, genelRengi, genelKilosu);
    }

    @Override
    public String food() {
        return "Et ve kanla beslenir ve denizde baliklari yer";
    }

    @Override
    public String Yuzucu() {
        return "Cok iyi yuzucudur ve yaklashik saatde 56.3 km/h hiza olurushlar";
    }
}
