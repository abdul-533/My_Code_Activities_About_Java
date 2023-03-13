package Gun39._05_OOPSoru1;

public class Pilav implements IFood{
    @Override
    public void taste() {
        System.out.println("Cocuklarin vazgecilmezi");

    }

    @Override
    public double ucret() {
        return 20;
    }
    void fry(){
        System.out.println("Pirinc ve sehriye kovruldu");
    }
    void boil(){
        System.out.println("Kisik ateshte pisirildi");
    }
}
