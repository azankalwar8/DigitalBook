import java.util.Objects;

public class Ebook extends Book {
    private String format;
    private double size;

    public Ebook() {
        super();
        this.format = "";
        this.size = 0;

    }

    public Ebook(String authoerName, String bookName, String edition, String format, double size) {
        super(authoerName, bookName, edition);
        this.format = format;
        this.size = size;

    }

    public Ebook(Ebook other) {
        super(other);
        this.format = other.format;
        this.size = other.size;
    }

    public String getformat() {
        return this.format;
    }

    public double getsize() {
        return this.size;
    }

    public void setformat(String format) {
        this.format = format;
    }

    public void setsize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString() + "Size: " + size + "Format: " + format;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Ebook b))
            return false;
        return (this.format == b.format) && (this.size == b.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(format, size);
    }

    @Override
    public Ebook clone() {
        return (Ebook) super.clone();
    }
}
