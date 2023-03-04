package Gun33_Inheritance._02_Inheritance;

public class Snake extends Animal {
    private int length;


    public Snake(String color, int kilo, String genus, int length) {
        super(color, kilo, genus);
        setLength(length);
    }

    @Override
    public void spoke() {
        System.out.println("Fis...Fiss.....");
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
