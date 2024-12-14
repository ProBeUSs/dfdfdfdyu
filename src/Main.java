public class Main {
    public static void main(String[] args) {
        Library library = new Library();


        FictionBook book1 = new FictionBook("Dune", "Frank Herbert", 1965, "123456789", "Science Fiction", true);
        EducationalBook book2 = new EducationalBook("Physics for Scientists", "John Doe", 2020, "987654321", "Physics", "University", true);
        library.addBook(book1);
        library.addBook(book2);


        Reader reader1 = new Reader("Alice", 1);
        Reader reader2 = new Reader("Bob", 2);
        library.registerReader(reader1);
        library.registerReader(reader2);


        library.lendBook("Dune", 1);
        library.lendBook("Physics for Scientists", 2);


        library.returnBook("Dune", 1);

        // Виведення книг
        System.out.println("All books in the library:");
        library.displayBooks();


        System.out.println("Search by genre 'Science Fiction':");
        library.searchByGenre("Science Fiction").forEach(book -> System.out.println(book.getInfo()));


        System.out.println("Search by subject 'Physics':");
        library.searchBySubject("Physics").forEach(book -> System.out.println(book.getInfo()));
    }
}