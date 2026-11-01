import java.util.Objects;

public class Audiobook extends Book {
    private String Narrator;
    private String format;

    public Audiobook() {
        super();
        this.format = "";
        this.Narrator = "";

    }

    public Audiobook(String authoerName, String bookName, String edition, String format, String Narrator) {
        super(authoerName, bookName, edition);
        this.format = format;
        this.Narrator = Narrator;

    }

    public Audiobook(Audiobook other) {
        super(other);
        this.format = other.format;
        this.Narrator = other.Narrator;
    }

    public String getformat() {
        return this.format;
    }

    public String getNarrator() {
        return this.Narrator;
    }

    public void setformat(String format) {
        this.format = format;
    }

    public void setNarrator(String Narrator) {
        this.Narrator = Narrator;
    }

    @Override
    public String toString() {
        return super.toString() + "Narrator: " + Narrator + "Format: " + format;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Audiobook b))
            return false;
        return (this.format == b.format) && (this.Narrator == b.Narrator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(format, Narrator);
    }

    @Override
    public Audiobook clone() {
        return (Audiobook) super.clone();
    }
}