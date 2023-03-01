package Gun30_Veriables._01_StaticVariables.Example1;

public class Student {
    String name;
    String surname;
    static String schoolName = "Yildirim Okulu";
    // if you suddenly change, the static variable will become a new one in a variable


    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + name + '\'' +
                ", Surname='" + surname + '\'' +
                ", School Name='" + schoolName + '\'' +

                '}';
    }
}
