class Book {
    private String title;
    private String author;
    private int year;
    private String isbn;
    private boolean isAvailable;

    public Book(String title, String author, int year, String isbn, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
        this.isAvailable = isAvailable;
    }

    public String getInfo() {
        return title + " by " + author + ", " + year + " (ISBN: " + isbn + ")";
    }

    public void changeAvailability(boolean status) {
        this.isAvailable = status;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getTitle() {
        return title;
    }
}