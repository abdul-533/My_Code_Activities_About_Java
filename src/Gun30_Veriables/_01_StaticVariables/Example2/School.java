package Gun30_Veriables._01_StaticVariables.Example2;

public class School {


    public static void main(String[] args) {

        Student std1 = new Student(1, "Ali Alizada");
        Student std2 = new Student(2, "Camal Cuha");
        Student std3 = new Student(3, "Amal Aliyev");
        // problem : i have to follow both id
        // also high probability of error

        Student std10 = new Student("Ali Badalov");
        Student std11 = new Student("Orxan Alizada");
        Student std12 = new Student("Bora Duman");
        System.out.println("Std10 = " + std10);
        System.out.println("Std11 = " + std11);
        System.out.println("Std12 = " + std12);

        Student std13 = new Student("Alim Qasimov");
        System.out.println("std13 = " + std13);


    }
}
