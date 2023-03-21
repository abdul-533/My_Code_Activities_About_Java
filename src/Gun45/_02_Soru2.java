package Gun45;

public class _02_Soru2 {
    public static void main(String[] args) {

        String name[] ={"Thomas","Peter","Josep"};
        String pwd[]=new  String[3];
        int indx=0;

        try {

        for (String n:name){

            pwd[indx]=n.substring(2,6); // omas,
            indx++;
        }


        }catch (Exception e){

            System.out.println("Invalide Name");
        }
        for (String  p :pwd)
            System.out.println(p); // omas . null , null


        //Invalide name
        // omas
        // mull
        //null


    }
}
