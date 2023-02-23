package Gun28_Constructor._Constructor2;

public class Book {
    String name;
    int PublishYear;
    String author;

    public Book (){


    }

    public Book(String name, int publishYear, String author){
        this.name=name;
        this.PublishYear=publishYear;
        this.author=author;

    }
    public Book(String name){
        this(name,0,"");

    }

    public String toString() {
        return name+" "+author+" "+PublishYear;
    }
}
