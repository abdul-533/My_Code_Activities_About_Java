package Gun28_Constructor._Constructor3;

public class Bookstore {

    //Example:
    // Write Book class.fields: name,publishYear,author.
    // Add 3 constructors.
    // Add a method that prints the properties of the books on a single line.
    // Create 3 books with different constructors and print them in the main.

    public static void main(String[] args) {

        Book k1 = new Book();

        Book k2 = new Book("Java", 2005, "Ismet");

        Book k3 = new Book("Tools", 2022);
        System.out.println("k3 = " + k2);
    }
}
