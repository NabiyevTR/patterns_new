package patterns.proxy;

import lombok.Builder;
import lombok.Data;

import java.util.Objects;

@Data
@Builder
public class Book {
    private String uuid;
    private String name;
    private String author;
    private String text;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(uuid, book.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid);
    }

    private int year;
}
