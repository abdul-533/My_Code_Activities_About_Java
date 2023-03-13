package Gun39._05_OOPSoru1;

public class AdanaKabab implements IFood{
    @Override
    public void taste() {
        System.out.println("Etin guzel hallerinden biri");

    }

    @Override
    public double ucret() {
        return 75;
    }

    void marine(){
        System.out.println("Et dunden ozel baharatlarla terbiye edildi");
    }
    void grill(){
        System.out.println("Komur ateshinde yavas pisirildi");
    }
}
