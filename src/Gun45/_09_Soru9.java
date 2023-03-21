package Gun45;

public class _09_Soru9 {
    public static void main(String[] args) {

        int [][] num=new int[3][1];

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = 10;
            }
        }


        for (int j = 0; j < num.length; j++) {
            for (int k = 0; k < num[j].length; k++) {
                System.out.println("num ["+j+"]["+k+"]= " + num[j][k]);

            }

        }

    }
}
