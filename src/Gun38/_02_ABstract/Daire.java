package Gun38._02_ABstract;

public class Daire extends Sekil {
    private double yaricap;

    public Daire(String name, double yaricap) {
        super(name);
        this.yaricap = yaricap;
    }

    public Daire(String name) {
        super(name);
    }

    @Override
   double Alan() {


        return Math.PI*this.yaricap;
    }

    @Override
    double Cevre() {

        return Math.PI*this.yaricap*2;
    }

}
