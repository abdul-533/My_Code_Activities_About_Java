package Gun29_Default_Private_Public_Protected._02_Private;

public class Worker {

    int id;   // default (if not prefixed)
    String name;       // default
    String surname;    //default
    private String password;   //private

    // has access only from the class it is in

    public void setPassword(String password) {

        // sifreyi kontrol ederek atayacaqiz
        if (password.length() < 8) {
            System.out.println("Weak Password");

        } else {

            this.password = password;
            System.out.println("Password retrieved successfully");
        }
    }

    public void showPassword() {
        System.out.println("****" + password.substring(4));
    }
}
