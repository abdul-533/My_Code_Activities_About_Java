package Gun32_Encapsulation_OOP_main_rules._02_Encapsulation;

public class CarMain {
    // A car object is requested to be created. fields(Color, Model, Engine Volume,Number of Doors)
    // Get the data of this object in accordance with OOP rules.
    // Create 1 object in Main and check it.
    public static void main(String[] args) {


        Car c1 = new Car("white", "Mersedes", 300, 4);
        System.out.println("Car= " + c1);

        // RULE: general software rule.
        // all variables are made private.
        // ie used with Encapsulation.
        // If necessary, private is removed.

    }
}
