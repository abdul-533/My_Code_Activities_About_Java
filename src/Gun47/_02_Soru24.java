package Gun47;

public class _02_Soru24 {
    public static void main(String[] args) {
        String shirts[][]=new String[2][2];

        shirts[0][0]="red";
        shirts[0][1]="blue";
        shirts[1][0]="small";
        shirts[1][1]="medium";

//        for (int i = 1; i < 2; i++) {  a)medium
//            for (int j = 1; j <i ; j++) {
//                System.out.println(shirts[i][j]+":");
//            }
//
//        }

//        for (int i = 0; i < 2; i++) {  //b) smal:
//            for (int j = 0; j <i ; j++) { // o calishmaz,1
//                System.out.println(shirts[i][j]+":");
//            }
//
//        }

//        for (int i = 0;i<=2;) { //rrayIndexOutOfBoundsException (Run time error)
//            for (int j = 0; j <=2;) {  //D)
//                System.out.println(shirts[i][j]);
//                j++;
//            }
//            i++;
//
//        }

        for (String[] g:  // right answer
             shirts) {
            for (String b:
                 g) {
                System.out.print(b+": ");

            }

        }


    }
}
