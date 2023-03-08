package Gun35_Polymorphizm._02_Polymorphizm;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("Meowed");
    }
    public void  scratched(){
        System.out.println("Scratched");
    }
}
