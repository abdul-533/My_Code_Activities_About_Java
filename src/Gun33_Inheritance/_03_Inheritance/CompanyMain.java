package Gun33_Inheritance._03_Inheritance;

public class CompanyMain {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Abdul", 10000, 1.2);
        System.out.println("Worker: " + worker1);

        GeneralManager gManager1 = new GeneralManager("Orxan", 12000, 1.8, 1000);
        System.out.println("General Manager: = " + gManager1);
    }
}
