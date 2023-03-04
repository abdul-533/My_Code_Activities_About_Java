package Gun33_Inheritance._03_Inheritance;

public class GeneralManager extends Worker {
    private double compensation;


    public GeneralManager(String name, double salary, double salaryCoefficient, double compensation) {
        super(name, salary, salaryCoefficient);
        setCompensation(compensation);
    }

    @Override
    public double salaryCalculator() {
        return super.salaryCalculator() + getCompensation();
    }

    @Override
    public String toString() {
        return "General Manager{" +
                "name='" + getName() + '\'' +
                ", salary=" + getSalary() +
                ", SalaryCoefficient=" + getSalaryCoefficient() +
                "Compensation" + getCompensation() +
                "Calculate Salary: " + salaryCalculator() +
                '}';
    }

    public double getCompensation() {
        return compensation;
    }

    public void setCompensation(double compensation) {
        this.compensation = compensation;
    }
}
