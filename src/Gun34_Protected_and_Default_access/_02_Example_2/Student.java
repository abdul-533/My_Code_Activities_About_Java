package Gun34_Protected_and_Default_access._02_Example_2;

//enum OgrType {
// PRIMARY,MIDDLE,HIGH;
//} chalishir if enum is defined like this
// Unlike the following, there is no publik in the beginning
public class Student {
    private final int id;
    private String name;
    private StdType type; // we can't call this enum
    private static int counter = 1;

    public Student( String name, StdType type) {
        this.id = counter++;
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

    public static int getCounter() {
        return counter;
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
