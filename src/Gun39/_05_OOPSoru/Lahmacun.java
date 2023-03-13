package Gun39._05_OOPSoru;

public class Lahmacun implements Ifood{

    void dough(){
        System.out.println("HAmur acildi");

    }
   void addMeat(){
       System.out.println("Et  eklendi");

    }
    void bake(){
        System.out.println("Bisiriledi");

    }


    @Override
    public void taste() {
        System.out.println("Enfes lahmacun afiyyet olsun");

    }

    @Override
    public double ucret() {
        return 0;
    }
}
