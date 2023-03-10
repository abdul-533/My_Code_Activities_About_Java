package Gun37._01_OrnekSoru2;

public class TeslaCAr extends Vehicle implements IElectric {
    public TeslaCAr(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBatary() {
        return "BAtary 9 yil omru var";
    }

    @Override
    public String drive() {
        return "Auto pilot ozelliyi var";
    }
}
