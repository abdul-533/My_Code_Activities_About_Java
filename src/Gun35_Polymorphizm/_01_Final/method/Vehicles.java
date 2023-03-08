package Gun35_Polymorphizm._01_Final.method;

public class Vehicles {
    private String model;

    public Vehicles(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public final String toString() {
        return "Vehicles{" +
                "model='" + model + '\'' +
                '}';
    }

    // finalized and other class not changed
    // not override . Constructors cannot be final only
    // methods specific
}
