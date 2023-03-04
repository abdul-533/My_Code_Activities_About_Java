package Gun33_Inheritance._02_Inheritance;

public class Duck extends Animal {

    private double wingSpan;

    public Duck(String color, int kilo, String genus, double wingSpan) {
        super(color, kilo, genus);
        setWingSpan(wingSpan);
    }

    @Override
    public void spoke() {
        System.out.println("Wak...Wak..");
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }
}
