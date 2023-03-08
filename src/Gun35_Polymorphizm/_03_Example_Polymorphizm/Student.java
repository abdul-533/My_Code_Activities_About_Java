package Gun35_Polymorphizm._03_Example_Polymorphizm;

public class Student extends SchoolArea {

    private String branch ;

    public Student(String name, String surname, String task, String branch) {
        super(name, surname, task);
        setBranch(branch);
    }


    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
