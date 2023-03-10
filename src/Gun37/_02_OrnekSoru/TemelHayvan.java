package Gun37._02_OrnekSoru;

public class TemelHayvan {
    //extradan
    private String turu;
    private String mizach;
    private String genelRengi;
    private double genelKilosu;

    public TemelHayvan(String turu, String mizach, String genelRengi, double genelKilosu) {
        setTuru(turu);
        setMizach(mizach);
        setGenelRengi(genelRengi);
        setGenelKilosu(genelKilosu);
    }

    public String getTuru() {
        return turu;
    }

    public void setTuru(String turu) {
        this.turu = turu;
    }

    public String getMizach() {
        return mizach;
    }

    public void setMizach(String mizach) {
        this.mizach = mizach;
    }

    public String getGenelRengi() {
        return genelRengi;
    }

    public void setGenelRengi(String genelRengi) {
        this.genelRengi = genelRengi;
    }

    public double getGenelKilosu() {
        return genelKilosu;
    }

    public void setGenelKilosu(double genelKilosu) {
        this.genelKilosu = genelKilosu;
    }
}
