package Gun32_Encapsulation_OOP_main_rules._01_Encapsulation;

public class PersonMain {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.setName("Ali");
        p1.setSurname("Alizada");
        p1.addAge(25);
        System.out.println("Age = " + p1.giveAge());
        System.out.println("Name = " + p1.getName());
        System.out.println("Surname= " + p1.getSurname());

        System.out.println("Person= " + p1);


        // One of the most important rules of Object Oriented is encapsulation, that is, making it private.
        // it is done by making a method and assigning it
        // Stopping direct references to datives


    }


}
