package Gun47;

public class _01_Soru23 {
    public static void main(String[] args) {


        String[][] arr = new String[2][];
        arr[0] = new String[2];
        arr[1] = new String[5];
        int a = 97;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = "" + a; // burda a yi otomatik olarak stringe cevirir;
                a++;

            }

        }

        for (String[] c : arr) {
            for (String n : c)
                System.out.print(n + " ,");
        }

    }
}
