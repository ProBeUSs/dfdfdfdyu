import java.util.List;
import java.util.ArrayList;

public class Reader {
    private String name;
    private int id;
    private List<Book> borrowedBooks;

    public Reader(String name, int id) {
        this.name = name;
        this.id = id;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.changeAvailability(false);
            System.out.println(name + " borrowed \"" + book.getTitle() + "\".");
        } else {
            System.out.println("Sorry, \"" + book.getTitle() + "\" is not available.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.changeAvailability(true);
            System.out.println(name + " returned \"" + book.getTitle() + "\".");
        } else {
            System.out.println(name + " does not have \"" + book.getTitle() + "\".");
        }
    }

    public int getId() {
        return id;
    }
}
