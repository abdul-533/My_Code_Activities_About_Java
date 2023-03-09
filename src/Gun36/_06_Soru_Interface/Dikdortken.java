package Gun36._06_Soru_Interface;

public class Dikdortken implements Geometri{
    @Override
    public double alan(int a, int b) {


        return a*b;
    }

    @Override
    public double Cevre(int a, int b) {


        return (2*(a+b));
    }
}
