package Gun35_Polymorphizm._02_Polymorphizm;

public class FarmMain {
    public static void main(String[] args) {

        Dog d1 = new Dog("Rex");
        Cat c1 = new Cat("Mlady");
        System.out.println("********************************");

        animalVoice(d1);
        animalVoice(c1);

        System.out.println("**************************************************");


        Animal a1 = new Animal("Duck");
        Animal a2 = new Dog("Kangal Dog");
        Animal a3 = new Cat("Lady Cat");

        System.out.println("***********************************");

        a1.voice();
        a2.voice();
        a3.voice();
        System.out.println("***********************************");

        a2.voice();
        // even a dog could not reach its own methods due to animal reference
        // methods are limited due to animal reference even if it is a dog
        // so how do I reveal this animal's dog form
        // type conversion will work for me

        ((Dog) a2).sniffed();
        // now I can use methods.
        // ((int)(math.Random()) casting like here


        animalVoice(a3);
        // here two features of the cat, one of which is a common tongue,
        // it will meow and scratch
    }

    public static void dogVoice(Dog dog) {

        dog.voice();
    }

    public static void catVoice(Cat cat) {

        cat.voice();
    }

    public static void animalVoice(Animal animal) {
        animal.voice();
        // both cats and dogs come here
        // we know where this came from here
        // we found out who a class is actually and do this if it's a dog, do this if it's a cat

        if (animal instanceof Dog) // Is the animal actually a dog?
            ((Dog) animal).sniffed();

        if (animal instanceof Cat) // Is the animal actually a cat?
            ((Cat) animal).scratched();


    }

    // Because we derive-extend from the animal class
    // also when we print from the method we added as animalSound
    // we write for dog and cat by override their classes
    // took the properties and wrote it.
    // But he scratched, smelled like cat, specially for dog class
    // We cannot print what we have written in the AnimalSound method.
}
