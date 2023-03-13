package Gun39._05_OOPSoru;

public class AdanaKebab implements Ifood{

    void marinade() {
        System.out.println("MArine edildi");

    }

    void grill() {
        System.out.println("Izqara yapildi");

    }

    @Override
    public void taste() {
        System.out.println("Enfes adana afiyyet olsu");

    }

    @Override
    public double ucret() {
        return 0;
    }
}
