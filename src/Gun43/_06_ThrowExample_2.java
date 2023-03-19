package Gun43;

import java.util.Scanner;

public class _06_ThrowExample_2 {
    public static void main(String[] args) throws Exception {



        Scanner oku=new Scanner(System.in);

        System.out.println("yeni sifre olushturma");
        System.out.println("Yeni sifreniz=");
        String newpassword=oku.nextLine();
        try {


            if (newpassword.length() < 8) {
                throw new Exception(" Sifre en az 8 karakterden olushur");
            } // kendim sunu hata olushturuyorum
            if (newpassword.length() > 15) {

                throw new Exception(" Sifre en cok 15 karakterden olushur");
            }// bu mesaj ile suni hata olushturuldu
        }catch (Exception ex){
            // hatalar bir yere toplanib hepisi icin yapilmasi gereken ishlevler
            //birarada burada yapilabilir mesela log tutma gibi
            System.out.println("lutfen dikkat");
            System.out.println("ex.getMessage() = " + ex.getMessage());
            // log tutma
        }
    }
}
