package Gun39._05_OOPSoru1;

public class Borsh implements IFood{
    @Override
    public void taste() {

    }

    @Override
    public double ucret() {
        return 40;
    }
    void boil(){
        System.out.println("Kisik ateshde kaynatiliyor");
    }
    void eatTomorrow(){
        System.out.println("Bir gun sonra servis edilir");

    }
}
