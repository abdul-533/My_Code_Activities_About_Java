package Gun38._02_ABstract;

public class Dikdortken extends Sekil {
    private double kisakenar;
    private double uzunkenar;

    public Dikdortken(String name, double kisakenar, double uzunkenar) {
        super(name);
        setKisakenar(kisakenar);
        setUzunkenar(uzunkenar);
    }

    public Dikdortken(String name) {
        super(name);
    }

    public double getKisakenar() {
        return kisakenar;
    }

    public void setKisakenar(double kisakenar) {
        this.kisakenar = kisakenar;
    }

    public double getUzunkenar() {
        return uzunkenar;
    }

    public void setUzunkenar(double uzunkenar) {
        this.uzunkenar = uzunkenar;
    }

    @Override
    double Alan() {


        return this.kisakenar*this.uzunkenar;
    }

    @Override
    double Cevre() {


        return 2*(this.uzunkenar+this.kisakenar);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}

