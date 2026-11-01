import java.util.Objects;

public class Physicalbook extends Book {
    private int page;
    private int libraryshelf;

    public Physicalbook() {
        super();
        this.page = 0;
        this.libraryshelf = 0;

    }

    public Physicalbook(String authorName, String bookName, String edition, int page, int libraryshelf) {
        super(authorName, bookName, edition);
        this.page = page;
        this.libraryshelf = libraryshelf;

    }

    public Physicalbook(Physicalbook other) {
        super(other);
        this.page = other.page;
        this.libraryshelf = other.libraryshelf;
    }

    public int getpage() {
        return this.page;
    }

    public int getlibrayshelf() {
        return this.libraryshelf;
    }

    public void setpage(int page) {
        this.page = page;
    }

    public void setlibrarybook(int libraryshelf) {
        this.libraryshelf = libraryshelf;
    }

    @Override
    public String toString() {
        return super.toString() + "libraryshelf: " + libraryshelf + "page: " + page;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Physicalbook p))
            return false;
        return (this.page == p.page) && (this.libraryshelf == p.libraryshelf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(page, libraryshelf);
    }

    @Override
    public Physicalbook clone() {
        return (Physicalbook) super.clone();
    }
}