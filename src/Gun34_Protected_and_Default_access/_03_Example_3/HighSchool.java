package Gun34_Protected_and_Default_access._03_Example_3;

public class HighSchool extends Student {
    private String branch;
    private static int highSchoolidcount = 1; // counter is unique to itself


    public HighSchool(String name, StdType type, String branch) {
        super(highSchoolidcount++, name, type);
        setBranch(branch);
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public static int getHighSchoolidcount() {
        return highSchoolidcount;
    }

    @Override
    public String toString() {
        return "HighSchool{" +
                "branch='" + branch + '\'' +
                "} " + super.toString();
    }
}
