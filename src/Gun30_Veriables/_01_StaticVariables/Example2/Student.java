package Gun30_Veriables._01_StaticVariables.Example2;

public class Student {
    int id;
    String fullName;
    static int counter = 1;

    // without static it always started with 0
    // when static there is no longer one
    // kept its value and always increased by 1
    // information belonging to all objects or
    // static is used for operations such as counter.


    public Student(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public Student(String fullName) {
        this.id = counter++;
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
