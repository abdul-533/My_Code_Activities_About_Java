package Gun29_Default_Private_Public_Protected._03_Protected._01_One;

public class Hospital {
    public static void main(String[] args) {
        Doctor dok1 = new Doctor();
        dok1.name = "Ali";
        dok1.section = "Internal medicine";
        dok1.hospitalNAme = "Ancara hospital";
        //dok1.SicilNo private


        Doctor doc2=new Doctor("Mehmet");

    }
}
