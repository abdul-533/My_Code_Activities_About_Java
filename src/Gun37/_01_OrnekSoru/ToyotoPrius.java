package Gun37._01_OrnekSoru;

public class ToyotoPrius extends Vehicle  implements Igas,Ielektrik{
    public ToyotoPrius(String model, Double engine) {
        super(model, engine);
    }

    @Override
    public void cahngeoil() {
        System.out.println("oil Changed");
    }

    @Override
    public String drive() {
        System.out.println("Drived");
        return null;
    }

    @Override
    public void changeBattery() {
        System.out.println("Batary changed already");
    }
}
