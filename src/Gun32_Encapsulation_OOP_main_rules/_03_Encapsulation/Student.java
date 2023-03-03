package Gun32_Encapsulation_OOP_main_rules._03_Encapsulation;

public class Student {
    private int ID;
    private String name;
    private String surname;
    private int age;

    static int counterID = 1;

    public Student(String name, String surname, int age) {
        setID(counterID++);
        setName(name);
        setSurname(surname);
        setAge(age);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int yas) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
