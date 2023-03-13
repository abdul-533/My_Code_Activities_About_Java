package Gun39._05_OOPSoru;

public class Borsh implements Ifood {

    void boil() {
        System.out.println("Borsh kaynatildi");

    }

    void eatTomorrow() {
        System.out.println("Et eklendi");

    }

    @Override
    public void taste() {
        System.out.println("Enfes borsh afiyyet olsu");

    }

    @Override
    public double ucret() {
        return 0;
    }
}
