package Gun38._03_AbstractSoru_KEndimYApdim;

public class FoodMain {
    public static void main(String[] args) {

        Baklava b1=new Baklava();
        b1.setName(("Milli"));
        b1.taste();
        b1.madeln();
        GreekSalad g1=new GreekSalad();
        g1.setName("Salad");
        g1.taste();
        g1.madeln();
        SezarSalad s1=new SezarSalad();
        s1.setName("MMM");
        s1.madeln();
        s1.taste();



    }
}
