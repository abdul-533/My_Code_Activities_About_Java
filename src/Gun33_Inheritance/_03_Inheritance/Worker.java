package Gun33_Inheritance._03_Inheritance;

public class Worker {
    private String name;
    private double salary;
    private double SalaryCoefficient;

    public Worker(String name, double salary, double salaryCoefficient) {
        setName(name);
        setSalary(salary);
        setSalaryCoefficient(salaryCoefficient);
    }

    public double salaryCalculator() {
        return salary * SalaryCoefficient;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", SalaryCoefficient=" + SalaryCoefficient +
                "Salary Calculate: " + salaryCalculator() +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalaryCoefficient() {
        return SalaryCoefficient;
    }

    public void setSalaryCoefficient(double salaryCoefficient) {
        SalaryCoefficient = salaryCoefficient;
    }
}
