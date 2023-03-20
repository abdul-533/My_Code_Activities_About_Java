package Gun44;

public class _04_Soru3 {
    public static void main(String[] args) {

        int [] stack={10,20,30};
        int size=3;
        int idx=0;
// buradaki idx iki olmali ki 30 yazsin
//
//        do {
//            idx++;  // 1,
//
//        }while (idx>=size); (1>=3) devam etmez. sonuc 20 yazar


//        while (idx<size){ //(idx<3)
//            idx++; // en son 3 oldu
//        } // sonuc exception cunki idx en son 3.

        do {
            idx++;
        }while (idx<size-1);
        System.out.println(" = " +stack[idx]); // burda 30 yazar sonucu


    }
}
