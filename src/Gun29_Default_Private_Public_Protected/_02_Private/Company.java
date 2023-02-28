package Gun29_Default_Private_Public_Protected._02_Private;

public class Company {
    public static void main(String[] args) {
        Worker cal1 = new Worker();
        cal1.id = 1;
        cal1.name = "Ali";
        cal1.surname = "Alizada";


        //  cal1.password="1234";
        //  private cannot be called even from its own package.
        cal1.setPassword("1234");
        cal1.setPassword("M123_sdf23");
        cal1.showPassword();


    }
}
