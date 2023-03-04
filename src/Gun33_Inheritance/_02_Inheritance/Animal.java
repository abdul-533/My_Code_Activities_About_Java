package Gun33_Inheritance._02_Inheritance;

public class Animal { // super class, base . parent
    private String color;
    private int kilo;
    private String genus;

    public Animal(String color, int kilo, String genus) {
        setColor(color);
        setKilo(kilo);
        setGenus(genus);
    }

    public void spoke() {
        System.out.println("Made a sound");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }
}
