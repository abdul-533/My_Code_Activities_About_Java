package Gun37._01_OrnekSoru;

public class Bus extends Vehicle implements Idiesel {
    public Bus(String model, Double engine) {
        super(model, engine);
    }

    @Override
    public void chargeDiesel() {
        System.out.println("yakit yok");
    }

    @Override
    public String drive() {

        return null;
    }
}
