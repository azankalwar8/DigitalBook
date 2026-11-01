import java.util.Objects;

abstract class Book implements Cloneable {
    private String authorName;
    private String bookName;
    private String edition;

    public Book() {
        this.authorName = "";
        this.bookName = "";
        this.edition = "";
    }

    public Book(String authorname, String bookName, String edition) {
        this.authorName = authorname;
        this.bookName = bookName;
        this.edition = edition;
    }

    public Book(Book other) {
        this(other.authorName, other.bookName, other.edition);
    }

    public String getauthorName() {
        return this.authorName;
    }

    public String getbookName() {
        return this.bookName;
    }

    public String getEdition() {
        return this.edition;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setbookNAme(String bookName) {
        this.bookName = bookName;
    }

    public void setedition(String editon) {
        this.edition = editon;
    }

    @Override
    public String toString() {
        return "authorName : " + authorName + "bookName : " + bookName + "edition :" + edition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Book b))
            return false;
        return (this.bookName == b.bookName) && (this.authorName == b.bookName) && (this.edition == b.edition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, bookName, edition);

    }

    @Override
    public Book clone() {
        try {
            return (Book) super.clone();
        } catch (CloneNotSupportedException b) {
            throw new RuntimeException(b);
        }
    }
}