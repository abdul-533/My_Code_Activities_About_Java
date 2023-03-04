package Gun33_Inheritance._02_Inheritance;

public class ZoologicalGarden {
    //Example:
    // I want to write a program for a zoo.
// For cats (color, weight, breed)
// for dogs (color, weight, breed)
// for snakes color, weight, breed, length)
// for duck (color, weight, breed, wing span)
// all animals have a method of talking.(sounded out)

    public static void main(String[] args) {

        Cat cat1 = new Cat("black", 7, "male");
        System.out.print("Cat: ");
        cat1.spoke();

        Dog dog1 = new Dog("white", 25, "female");
        System.out.print("Dog: ");
        dog1.spoke();

        Duck duck1 = new Duck("green", 2, "male", 0.7);
        System.out.print("Duck: ");
        duck1.spoke();

        Snake snake1=new Snake("brown",8,"female",6);
        System.out.print("Snake: ");
        snake1.spoke();

    }


}
