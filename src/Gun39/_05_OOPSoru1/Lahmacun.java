package Gun39._05_OOPSoru1;

public class Lahmacun implements IFood{
    @Override
    public void taste() {
        System.out.println("Mukemmel yerli pizza");

    }

    @Override
    public double ucret() {
        return 20;
    }
    void dough(){
        System.out.println("Mayali hamur hazirlandi");
    }
    void addMeat(){
        System.out.println("Ozel kiyma eklendi");

    }
    void bake(){
        System.out.println("Odun ateshinde bisirildi");

    }
}
