package Gun39._05_OOPSoru1;

import MyFunction.MyFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TechnocafeMain {
    public static void main(String[] args) {
        List<IFood> sifarishler=new ArrayList<>();
        Scanner oku=new Scanner(System.in);

        int secim=0;

        do {
            Menu();
            secim= oku.nextInt();
            switch (secim){
                case 1:IFood ad=new AdanaKabab();
                sifarishler.add(ad);break;
                case 2:IFood lh=new Lahmacun();
                    sifarishler.add(lh);break;
                case 3:IFood bs=new Borsh();
                    sifarishler.add(bs);break;
                case 4:IFood pv=new Pilav();
                    sifarishler.add(pv);break;
            }


        }while (secim<5);
        System.out.println("Alinan Sifarishler");
        MyFunction.Bekle(2);
        System.out.print(".");
        MyFunction.Bekle(1);
        System.out.print(".");
        MyFunction.Bekle(1);
        System.out.println(".");

        for (IFood f:sifarishler) {
            System.out.println(f.getClass().getSimpleName());
        }
        System.out.println("Sifarishleriniz hazirlaniyor");
        MyFunction.Bekle(2);
        double toplam=0;
        for (IFood f:sifarishler) {
            TechnoKitchen.hazirla(f);
            toplam +=f.ucret();
            MyFunction.Bekle(2);
        }

        System.out.print(".");
        MyFunction.Bekle(1);
        System.out.print(".");
        MyFunction.Bekle(1);
        System.out.println(".");

        System.out.println("toplam ucretiniz = " + toplam+" TL");
    }
    public static void Menu(){
        System.out.println("*****Menü*****\n" +
                "1-Adana Kebap (75 TL)\n" +
                "2-Lahmacun (20 TL)\n" +
                "3-Borsh (40 TL)\n" +
                "4-Palov (20 TL)\n" +
                "5-Tamam\n"+"Seciminiz");
    }
}
