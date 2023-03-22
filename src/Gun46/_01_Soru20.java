package Gun46;

import java.util.Arrays;

public class _01_Soru20 {
    public static void main(String[] args) {

      int[][] arr=new int[2][4];  //(4) ikinci boyutun sutunun bir onemi yok cunki asaqida yendien boyutlandiriliyor

      arr[0] =new int[]{1,3,5,7};
      arr[1] =new int[]{1,3};


      for(int []a : arr){
          for (int i : a)
              System.out.print(i+", ");

          System.out.println();
      }
        System.out.println("***************************************");

      // ayni durum

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);

            }
            System.out.println();

        }

      



    }
}
