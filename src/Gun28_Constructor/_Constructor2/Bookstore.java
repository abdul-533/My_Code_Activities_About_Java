package Gun28_Constructor._Constructor2;

public class Bookstore {
    // Write Book class.fields: name,publishYear,author.
    // Add 3 constructors.
    // Add a method that prints the properties of the books on a single line.
    // Create 3 books with different constructors and print them in the main.
    public static void main(String[] args) {

        Book b1 = new Book();
        b1.name = "Harry Potter";
        b1.author = "J.K. Rowling";
        b1.PublishYear = 1997;

        Book b2 = new Book("Lord of the Rings", 1995, "J.R.R. Tolkien");

        Book b3 = new Book("Grapes and Tea");

        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);


    }
}
