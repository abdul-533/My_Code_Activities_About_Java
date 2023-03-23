package Gun47;

public class _04_Soru26 {
    public static void main(String[] args) {

        int [][]n= {{1,3},{2,4}};

        for (int i = n.length-1; i >=0; i--) {
            for (int a: n[i])
                System.out.print(a+",");

        }


    }
}
