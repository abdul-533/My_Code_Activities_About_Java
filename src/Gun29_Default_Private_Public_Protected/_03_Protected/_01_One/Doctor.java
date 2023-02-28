package Gun29_Default_Private_Public_Protected._03_Protected._01_One;

public class Doctor {

    protected String name; // same as default
    String section;
    private String RegistrationNo; //private

    public String hospitalNAme; //public

    Doctor() { // default constructor

    }

    public Doctor(String name) {

        this.name = name;
    }

}
