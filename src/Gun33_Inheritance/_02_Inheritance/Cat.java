package Gun33_Inheritance._02_Inheritance;

public class Cat extends Animal {


    public Cat(String color, int kilo, String genus) {
        super(color, kilo, genus);
    }

    @Override
    public void spoke() {
        System.out.println("Meow, meow...");
    }
}
