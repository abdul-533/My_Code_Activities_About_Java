package Gun45;

import java.util.Arrays;

public class _08_Soru8 {
    public static void main(String[] args) {
 // kolay soru
       int [][] num=new int[1][3];

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = 10;
            }
            }


            for (int j = 0; j < num.length; j++) {
                for (int k = 0; k < num[j].length; k++) {
                    System.out.println("num [" + j + "][" + k + "]= " + num[j][k]);

                }

            }

        }

    }

