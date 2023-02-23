package Gun28_Constructor._Constructor1;

public class Student {

    public static Student std3;
    int id;
    String name;
    String surname;
    int class_;

    public Student() {
        System.out.println("Object Created");

    }

    public Student(int id, String name, String surname, int class_) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.class_ = class_;
    }

    public Student(int id, String name, String surname) { // constructor methods (runs on first run)

         this(id,name,surname,0);// this student method itself

//        this.id = id;
//        this.name = name;
//        this.surname = surname;
//        this.class_= 0;


    }
}





