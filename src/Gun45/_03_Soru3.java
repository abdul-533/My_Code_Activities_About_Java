package Gun45;

public class _03_Soru3 {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D"};
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);

            if (arr[i].equals("C")) { // ilk adimda burasi caloshmadi
                continue;
            }
            System.out.println("Work done");
            break; // burda break olduqu  icin direk don
        }
         //A
        //Work done

    }
}
