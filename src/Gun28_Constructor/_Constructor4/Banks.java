package Gun28_Constructor._Constructor4;

public class Banks {
    // Define a bank class.
    // Add 3 fields (name, number of branches, year of establishment)
    // Add 3 constructors.
    // create the toString method.
    // Create 3 objects and print them in main.

    public static void main(String[] args) {

        Bank b1 = new Bank("Ziraat", 1861, 1863);
        Bank b2 = new Bank("Garanti", 500);
        Bank b3 = new Bank();

        System.out.println("b3 = " + b3);
        System.out.println("b2 = " + b2);
        System.out.println("b1 = " + b1);


    }
}
