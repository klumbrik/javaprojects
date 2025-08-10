package LibraryManagement;

public class Book {
    private String title;
    private String author;
    private Genre genre;
    private boolean available;

    public Book(String title, String author, Genre genre, boolean available) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = available;
    }

    //getters

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public Genre getGenre() {
        return genre;
    }
    public boolean getAvailable() {
        return available;
    }

    //setter for availability
    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return String.format("%s by %s [%s] - %s", title, author, genre, available ? "available" : "checked out");
    }
}