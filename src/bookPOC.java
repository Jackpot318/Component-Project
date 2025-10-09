import java.math.BigInteger;
import java.util.LinkedList;

class Book {

    String title;
    String author;
    String genre;
    int pages;
    BigInteger isbn;

    public Book(String title, String author, String genre, int pages,
            String isbnString) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.pages = pages;
        this.isbn = new BigInteger(isbnString);
    }

    public void printBookInfo() {

        System.out.println(this.title);
        System.out.println(this.author);
        System.out.println(this.genre);
        System.out.println(this.pages);
        System.out.println(this.isbn);

    }
}

class Library {

    private LinkedList<Book> bookCollection;

    public Library() {
        this.bookCollection = new LinkedList<>();
    }

    public void addBook(Book b) {
        this.bookCollection.add(b);
    }

    public void removeBook(Book b) {
        this.bookCollection.remove(b);
    }

    public Book getBook(int i) {
        return this.bookCollection.get(i);
    }

    public int length() {
        return this.bookCollection.size();
    }
}

public class bookPOC {

    public static void main(String[] args) {

        Library shelf = new Library();

        Book inferno = new Book("Inferno", "Dan Brown", "Thriller", 642,
                "9780385537858");
        Book camelClub = new Book("The Camel Club", "David Baldacci",
                "Thriller", 816, "9780330523493");
        Book goodNightMoon = new Book("Goodnight Moon", "Margaret Brown",
                "Children's", 12, "0064430170");

        shelf.addBook(inferno);
        shelf.addBook(camelClub);
        shelf.addBook(goodNightMoon);

        System.out.println(shelf.length());

        shelf.removeBook(camelClub);

        System.out.println(shelf.length());

        shelf.getBook(0).printBookInfo();

    }
}