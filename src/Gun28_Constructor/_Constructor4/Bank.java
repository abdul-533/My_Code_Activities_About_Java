package Gun28_Constructor._Constructor4;

public class Bank {
    String name;
    int branchNumber;
    int year_Of_Establishment;

    public Bank() {
    }

    public Bank(String name, int branchNumber, int year_Of_Establishment) {
        this.name = name;
        this.branchNumber = branchNumber;
        this.year_Of_Establishment = year_Of_Establishment;
    }

    public Bank(String name, int branchNumber) {
        this.name = name;
        this.branchNumber = branchNumber;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "Name='" + name + '\'' +
                ", BranchNumber=" + branchNumber +
                ", Year_Of_Establishment=" + year_Of_Establishment +
                '}';
    }
}
