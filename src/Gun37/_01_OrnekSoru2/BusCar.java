package Gun37._01_OrnekSoru2;

public class BusCar extends Vehicle implements Idiesel {
    public BusCar(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeDiesel() {
        return "Bir depo ile 1000 km gider";
    }

    @Override
    public String drive() {
        return "En fazla 90 km hiz yapmali";
    }
}
