package Gun37._02_OrnekSoru;

import java.util.ArrayList;
import java.util.Arrays;

public class AnimalsMain {
    public static void main(String[] args) {
        //Extralarla birlikde
        Cat cat = new Cat("Maine Coon Kedisi", "Sadık, Disiplinli", "Krem,Siyah", 5);
        Duck duck = new Duck("Yaz Ördeği", "Genelde yabani yasharlar, zararsizdir", "soluk kumlu-kahverengi ", 1.5);
        Shark shark = new Shark("Goblin Köpek Balığı ", "nadir görülen derin okyanus ve deniz dibinde yaşar", "kırmızı", 200);
        Swallow swallow = new Swallow("Kırlangıç,", "çok soğuk havalar dışında dünyanın her yerinde yaşamaları mümkün olan kuşlardandır", "karnı beyaz, baş, kuyruk ve kanatları siyah", 0.02);
        ArrayList<TemelHayvan> hayvanlar = new ArrayList<>(Arrays.asList(cat, duck, shark, swallow));
        for (TemelHayvan hayvan : hayvanlar) {
            System.out.println("************INFORMATION*************");
            System.out.println("ABOUT: " + hayvan.getClass().getSimpleName());
            System.out.println("______");

            System.out.println("Turu: " + hayvan.getTuru());  //Extra tanimlama
            System.out.println("Mizachi: " + hayvan.getMizach());//Extra tanimlama
            System.out.println("Genel rengi: " + hayvan.getGenelRengi());//Extra tanimlama
            System.out.println("Genel kilosu: " + hayvan.getGenelKilosu());//Extra tanimlama
            if (hayvan instanceof Cat) {
                System.out.println(((Cat) hayvan).food());
            } else if (hayvan instanceof Duck) {
                System.out.println(((Duck) hayvan).food());
                System.out.println(((Duck) hayvan).Ucucu()); //extra claslarim
                System.out.println(((Duck) hayvan).Yuzucu()); //extra claslarim
            } else if (hayvan instanceof Shark) {
                System.out.println(((Shark) hayvan).food());
                System.out.println(((Shark) hayvan).Yuzucu()); //extra claslarim
            } else if (hayvan instanceof Swallow) {
                System.out.println(((Swallow) hayvan).food());
                System.out.println(((Swallow) hayvan).Ucucu()); //extra claslarim
            }
            System.out.println("*************************************");
            System.out.println();
        }
    }
}
