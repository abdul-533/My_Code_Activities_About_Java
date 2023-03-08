package Gun35_Polymorphizm._03_Example_Polymorphizm;

public class S_Worker extends SchoolArea {

    private String departament;

    public S_Worker(String name, String surname, String task, String departament) {
        super(name, surname, task);
        setDepartament(departament);
    }


    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }


}
