package Gun37._01_OrnekSoru;

public class TeslaCar extends Vehicle implements Ielektrik{
    public TeslaCar(String model, Double engine) {
        super(model, engine);
    }

    @Override
    public void changeBattery() {
        System.out.println("Changed");
    }

    @Override
    public String drive() {
        System.out.println("drived");
        return null;
    }

}
