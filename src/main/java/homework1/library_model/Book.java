package homework1.library_model;

public class Book {

    private String name;
    private int numberOfPages;
    private Author author;

    public Book() {
    }

    public Book(String name, int numberOfPages, Author author) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.author = author;
    }

    public String getName() {

        return name;
    }

    public int getNumberOfPages() {

        return numberOfPages;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" + "name='" + name + '\'' + ", numberOfPages=" + numberOfPages + ", author=" + author + '}';
    }
}
