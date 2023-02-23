package Gun28_Constructor._Constructor1;

public class School {

    public static void main(String[] args) {

        Student std1 = new Student(); // object was born here at the moment of creation
        //1. yol
        std1.id = 1; // the valuesof the properties are given,
        std1.name = "Ali";
        std1.surname = "Alizada";
        std1.class_ = 5;
        System.out.println("Student1 name = " + std1.name);


        //Second way:
        Student std2 = new Student(1, "Ismet", "Temnur", 5);
        System.out.println("Student2 name = " + std2.name);

        //3Third way:

        Student std3 = new Student(2, "Ayshe", "Bayrak");


    }
}
