package Gun33_Inheritance._02_Inheritance;

public class Dog extends Animal {


    public Dog(String color, int kilo, String genus) {
        super(color, kilo, genus);
    }

    @Override
    public void spoke() {
        System.out.println("Hav...Hav...");

    }
}
