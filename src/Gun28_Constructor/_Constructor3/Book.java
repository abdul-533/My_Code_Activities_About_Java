package Gun28_Constructor._Constructor3;

public class Book {
    String name;
    int PublishYear;
    String author;

    public Book() {
    }

    public Book(String name, int publishYear, String author) {
        this.name = name;
        PublishYear = publishYear;
        this.author = author;
    }

    public Book(String name, int publishYear) {
        this.name = name;
        PublishYear = publishYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", PublishYear=" + PublishYear +
                ", author='" + author + '\'' +
                '}';
    }
}

