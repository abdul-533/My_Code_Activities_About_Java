package Gun36._04_Interface;

import Gun36._03_Interface.ICizdirir;
// 1 class birden fazla Interface implamente edebilir
public class A4  implements Igosterir, Iyazdirir {
    @Override
    public void goster() {
        System.out.println("Gosterdi");

    }

    @Override
    public void yazdir() {
        System.out.println("Yazdirdi");

    }
}
