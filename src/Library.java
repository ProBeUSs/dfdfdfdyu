import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Library {
    private List<Book> books;
    private List<Reader> readers;

    public Library() {
        books = new ArrayList<>();
        readers = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void registerReader(Reader reader) {
        readers.add(reader);
    }

    public void lendBook(String bookTitle, int readerId) {
        Book book = books.stream()
                .filter(b -> b.getTitle().equals(bookTitle) && b.isAvailable())
                .findFirst()
                .orElse(null);
        Reader reader = readers.stream()
                .filter(r -> r.getId() == readerId)
                .findFirst()
                .orElse(null);

        if (book != null && reader != null) {
            reader.borrowBook(book);
        } else {
            System.out.println("Book \"" + bookTitle + "\" or reader with ID " + readerId + " not found, or book is not available.");
        }
    }

    public void returnBook(String bookTitle, int readerId) {
        Reader reader = readers.stream()
                .filter(r -> r.getId() == readerId)
                .findFirst()
                .orElse(null);
        Book book = books.stream()
                .filter(b -> b.getTitle().equals(bookTitle))
                .findFirst()
                .orElse(null);

        if (reader != null && book != null) {
            reader.returnBook(book);
        } else {
            System.out.println("Book \"" + bookTitle + "\" or reader with ID " + readerId + " not found.");
        }
    }

    public void displayBooks() {
        books.forEach(book -> System.out.println(book.getInfo()));
    }

    public List<FictionBook> searchByGenre(String genre) {
        return books.stream()
                .filter(book -> book instanceof FictionBook && ((FictionBook) book).getGenre().equals(genre))
                .map(book -> (FictionBook) book)
                .collect(Collectors.toList());
    }

    public List<EducationalBook> searchBySubject(String subject) {
        return books.stream()
                .filter(book -> book instanceof EducationalBook && ((EducationalBook) book).getSubject().equals(subject))
                .map(book -> (EducationalBook) book)
                .collect(Collectors.toList());
    }
}
