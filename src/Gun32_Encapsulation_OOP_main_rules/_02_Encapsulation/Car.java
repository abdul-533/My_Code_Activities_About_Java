package Gun32_Encapsulation_OOP_main_rules._02_Encapsulation;

public class Car {
    private String color;
    private String model;
    private double engineCapacity;
    private int doorCount;


    public Car() {
    }

    public Car(String color, String model, double engineCapacity, int doorCount) {
        setColor(color);
        setModel(model);
        setEngineCapacity(engineCapacity);
        setDoorCount(doorCount);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        if (doorCount < 7 && doorCount > 1)
            this.doorCount = doorCount;
        else
            System.out.println("You entered the wrong number, re-enter it should be between 1-7");
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", engineCapacity=" + engineCapacity +
                ", doorCount=" + doorCount +
                '}';
    }
}

