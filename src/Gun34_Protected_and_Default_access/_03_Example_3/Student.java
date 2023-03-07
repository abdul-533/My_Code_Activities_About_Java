package Gun34_Protected_and_Default_access._03_Example_3;


public class Student {
    private final int id;
    private String name;
    private StdType type;

    public Student(int id, String name, StdType type) {
        this.id = id;
        setName(name);
        setType(type);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StdType getType() {
        return type;
    }

    public void setType(StdType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
