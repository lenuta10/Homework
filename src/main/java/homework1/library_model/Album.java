package homework1.library_model;

public class Album extends Book{

    private String paperQuality;

    public Album(){
    }

    public Album(String name, int nrOfPages, Author author, String paperQuality) {
        super(name, nrOfPages, author);
        this.paperQuality = paperQuality;
    }

    public String getPaperQuality() {
        return paperQuality;
    }

    public void setPaperQuality(String paperQuality) {
        this.paperQuality = paperQuality;
    }

    @Override
    public String toString() {
        return "Album{" +
                "name='" + getName() + '\'' +
                "nrOfPages=" + getNumberOfPages() +
                "author='" + getAuthor() + '\'' +
                "paperQuality='" + paperQuality + '\'' +
                '}';
    }
}
