package Gun37._01_OrnekSoru2;

public class ToyotoPrius extends Vehicle implements IElectric,Igas {
    public ToyotoPrius(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBatary() {
        return "Omur boyu Kullan";
    }

    @Override
    public String changeOil() {
        return "Bir depo ile 300 km gideer";
    }

    @Override
    public String drive() {
        return "Ilk 3 km elektrikle gider";
    }
}
