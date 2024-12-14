class FictionBook extends Book {
    private String genre;

    public FictionBook(String title, String author, int year, String isbn, String genre, boolean isAvailable) {
        super(title, author, year, isbn, isAvailable);
        this.genre = genre;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " - Genre: " + genre;
    }

    public String getGenre() {
        return genre;
    }
}
