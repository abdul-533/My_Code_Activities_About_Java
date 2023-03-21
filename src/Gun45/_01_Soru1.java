package Gun45;

public class _01_Soru1 {
    public static void main(String[] args) {
        String name[] ={"Thomas","Peter","Josep"};
        String pwd[]=new  String[3];
        int indx=0;

        try {
            for (String n :name){
                pwd[indx]=n.substring(2,6); // 2 dahil 6 dahil deyil
                System.out.println(pwd[indx]);
                indx++;
            }

        }catch (Exception e)
        {

            System.out.println("Invalide Name");
        }

        // omas
        //Invalide name

    }
}
