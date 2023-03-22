package Gun46;

public class _03_Soru {
    public static void main(String[] args) {

        String [][] shs=new String[5][2];
        shs[0]=new String[4];
        shs[1]=new String[5];
        int i=97;

        System.out.println("shs.length = " + shs.length);
        System.out.println("shs[0].length = " + shs[0].length); //0 satir uzunluk
        System.out.println("shs[1].length = " + shs[1].length); // 1 satir uzunluk
        System.out.println("shs[2].length = " + shs[2].length); // 2 bunlar deyoishmedi 2 duruyor hala


        for (int j = 0; j < shs.length; j++) {

         //   for (int k = 0; k < shs.length; k++) {  //ArrayIndexOutOfBoundsException hatasi vericek
            for (int k = 0; k < shs[j].length; k++) {
                shs[j][k]=" "+i;
                i++;

            }


            }


        for(String [] ca : shs){
            for(String c: ca) {
                System.out.print(c + ", ");
            }
        }
        System.out.println();
    }
}
