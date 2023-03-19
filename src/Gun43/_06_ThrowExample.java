package Gun43;

import java.util.Scanner;

public class _06_ThrowExample {
    public static void main(String[] args) {


        Scanner oku=new Scanner(System.in);

        System.out.println("yeni sifre olushturma");
        System.out.println("Yeni sifreniz=");
        String newpassword=oku.nextLine();
        // log tutma
        if( newpassword.length()<8){

            System.out.println("lutfen dikkat");
            System.out.println(" Sifre en az 8 karakterden olushur");
        }
        if( newpassword.length()>15){

            System.out.println("lutfen dikkat");
            System.out.println(" Sifre en cok 15 karakterden olushur");
        }// log tutma
    }
}
