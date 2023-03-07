package Gun34_Protected_and_Default_access._02_Example_2;

public class HighSchoolStd extends Student {
    private String branch;


    public HighSchoolStd(String name, StdType type, String branch) {
        super(name, type);
        setBranch(branch);
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "HighSchoolStd{" +
                "branch='" + branch + '\'' +
                "} " + super.toString();
    }
}
