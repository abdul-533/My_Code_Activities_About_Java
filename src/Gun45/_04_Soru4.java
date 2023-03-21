package Gun45;

public class _04_Soru4 {
    public static void main(String[] args) {
     String [] arr={"A","B","C","D"};

        for (int i = 0; i < arr.length; i++) {

            System.out.print("arr = " + arr[i]);
            if (arr[i].equals("D")) {
                System.out.println("Work done");
                break;
            }

            continue; // bu soruda continuenin altoinda bior sey yok diye  gerekli deyil
        }


    }
}
