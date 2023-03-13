package Gun39._02_OOP_Soru;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("A = " + A.mesaje); // A dan merhaba

        B b = new B();
        System.out.println("A = " + A.mesaje); // B den merhaba
        A a2 = new A();
        System.out.println("A = " + A.mesaje); // B den merhaba

        // en sondada en sonku b de kalan deyeri vericek son olunu aldiqi icin

    }
}
