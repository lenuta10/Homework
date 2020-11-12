package homework1.library_model;

public class Novel extends Book {

    private String type;

    public Novel(String name, int numberrOfPages, Author author, String type) {
        super(name, numberrOfPages, author);
        this.type = type;
    }

    @Override
    public String toString() {
        return "Novel{" + "name='" + super.getName() + '\'' + "numberrOfPages=" + super.getNumberOfPages() + "author='" + super.getAuthor() + '\'' + "type='" + type + '\'' + '}';
    }
}
