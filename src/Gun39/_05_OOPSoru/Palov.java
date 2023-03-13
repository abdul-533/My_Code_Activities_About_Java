package Gun39._05_OOPSoru;

public class Palov implements Ifood{
   void fry(){
    System.out.println("Ingridiyentle kizartildi");

    }
    void boil(){
     System.out.println("Rise kaynatildi ve suzuldu");


    }
    @Override
    public void taste() {
     System.out.println("Enfes pilav afiyyet olsu...");

    }

    @Override
    public double ucret() {
        return 0;
    }
}
