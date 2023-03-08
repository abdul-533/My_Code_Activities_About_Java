package Gun35_Polymorphizm._02_Polymorphizm;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void voice(){
        System.out.println("Made a sound");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
