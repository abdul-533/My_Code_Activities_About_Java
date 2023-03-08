package Gun35_Polymorphizm._02_Polymorphizm;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("Barked");
    }

    public void sniffed() {
        System.out.println("Sniffed");
    }
}
