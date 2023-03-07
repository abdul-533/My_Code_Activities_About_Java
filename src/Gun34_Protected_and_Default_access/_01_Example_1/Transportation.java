package Gun34_Protected_and_Default_access._01_Example_1;

public class Transportation {
    private String color;
    private Double EngineCapacity;
    private String brand;

    @Override
    public String toString() {
        return "Transportation{" +
                "color='" + color + '\'' +
                ", EngineCapacity=" + EngineCapacity +
                ", brand='" + brand + '\'' +
                '}';
    }

    public Transportation(String color, Double engineCapacity, String brand) {
        setColor(color);
        setEngineCapacity(engineCapacity);
        setBrand(brand);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getEngineCapacity() {
        return EngineCapacity;
    }

    public void setEngineCapacity(Double engineCapacity) {
        EngineCapacity = engineCapacity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}