package Gun25_First_Step_with_Class;

// where class-types are defined

public class _01_JavaClassAndObject {

    //where the methods are written
    public static void main(String[] args) { // Start
        // where the main program starts and runs

        Car myCar = new Car(); // Car type, type name , my Car object
        myCar.model = "BMW";
        myCar.color = "white";
        myCar.engineCapacity = 1600;
        myCar.year = 2008;

        System.out.println("myCar.model = " + myCar.model);
        System.out.println("myCar.color = " + myCar.color);
        System.out.println("myCar.year = " + myCar.year);
        System.out.println("myCar.engineCapacity = " + myCar.engineCapacity);
    } // Finish

    //where the methods are written
}

// where class-types are defined

class Car {
    String color;
    int year;
    String model;
    int engineCapacity;
}
