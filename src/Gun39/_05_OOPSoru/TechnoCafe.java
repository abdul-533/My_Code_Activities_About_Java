package Gun39._05_OOPSoru;

import javafx.application.Platform;

import java.util.*;

public class TechnoCafe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        AdanaKebab adana = new AdanaKebab();
        Lahmacun lahM = new Lahmacun();
        Borsh borsh = new Borsh();
        Palov palov = new Palov();
        List Sifarish = new ArrayList<>();


        int girilen = 0;
        while (true) {
            int counter = 0;
            System.out.println("*************MENU*************");
            System.out.println("1 " + adana.getClass().getSimpleName() + " 55 TL");
            System.out.println("2 " + lahM.getClass().getSimpleName() + " 33 TL");
            System.out.println("3 " + borsh.getClass().getSimpleName() + " 33 TL");
            System.out.println("4 " + palov.getClass().getSimpleName() + " 44 TL");
            System.out.println("0" + " Tamam");
            System.out.println("SECIMINIZ: ");
            girilen = scan.nextInt();

            if (girilen == 0)
                break;
            switch (girilen) {

                case 1:
                    Sifarish.add(adana);
                    break;
                case 2:
                    Sifarish.add(lahM);
                    break;
                case 3:
                    Sifarish.add(borsh);
                    break;
                case 4:
                    Sifarish.add(palov);
                    break;
                default:
                    System.out.println("Hatali girish 0-4 arasi rakam giriniz");
            }

        }
        int a=ishlemyap(Sifarish);
        System.out.println();
        System.out.println("Sepetinizde toplam "+Sifarish.size()+" kadar urun var");
        System.out.println("Toplam fiyat= "+a+" tl");


    }

    public static int ishlemyap(List sifarishler) {
        int toplam = 0;
        for (int i = 0; i < sifarishler.size(); i++) {
            System.out.println("***********************************************");

            if (sifarishler.get(i) instanceof AdanaKebab) {
                System.out.println(((AdanaKebab) sifarishler.get(i)).getClass().getSimpleName() + " Sifarishi alindi");
                ((AdanaKebab) sifarishler.get(i)).grill();
                ((AdanaKebab) sifarishler.get(i)).marinade();
                ((AdanaKebab) sifarishler.get(i)).taste();
                toplam += 55;
            } else if (sifarishler.get(i) instanceof Lahmacun) {
                System.out.println(((Lahmacun) sifarishler.get(i)).getClass().getSimpleName() + " Sifarishi alindi");
                ((Lahmacun) sifarishler.get(i)).dough();
                ((Lahmacun) sifarishler.get(i)).addMeat();
                ((Lahmacun) sifarishler.get(i)).bake();
                ((Lahmacun) sifarishler.get(i)).taste();

                toplam += 33;
            } else if (sifarishler.get(i) instanceof Borsh) {
                System.out.println(((Borsh) sifarishler.get(i)).getClass().getSimpleName() + " Sifarishi alindi");
                ((Borsh) sifarishler.get(i)).boil();
                ((Borsh) sifarishler.get(i)).eatTomorrow();
                ((Borsh) sifarishler.get(i)).taste();
                toplam += 33;
            } else if (sifarishler.get(i) instanceof Palov) {
                System.out.println(((Palov) sifarishler.get(i)).getClass().getSimpleName() + " Sifarishi alindi");
                ((Palov) sifarishler.get(i)).fry();
                ((Palov) sifarishler.get(i)).boil();
                ((Palov) sifarishler.get(i)).taste();
                toplam += 44;
            }

        }
        return toplam;
    }
    }


