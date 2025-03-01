class EducationalBook extends Book {
    private String subject;
    private String level;

    public EducationalBook(String title, String author, int year, String isbn, String subject, String level, boolean isAvailable) {
        super(title, author, year, isbn, isAvailable);
        this.subject = subject;
        this.level = level;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " - Subject: " + subject + ", Level: " + level;
    }

    public String getSubject() {
        return subject;
    }
}