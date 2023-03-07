package Gun34_Protected_and_Default_access._01_Example_1;

public class Bus extends Transportation {
    private int passengerCapacity;

    public Bus(String color, Double engineCapacity, String brand, int passengerCapacity) {
        super(color, engineCapacity, brand);
        setPassengerCapacity(passengerCapacity);
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "passengerCapacity=" + passengerCapacity +
                "} " + super.toString();
    }


}


