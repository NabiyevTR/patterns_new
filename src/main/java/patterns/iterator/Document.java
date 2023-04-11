package patterns.iterator;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.ToString;

import java.util.*;

@Data
public class Document {

    private String id;
    @ToString.Exclude
    private Set<String> fieldsToCopy = new HashSet<>();
    private Map<String, String> metadata = new HashMap<>();
    private String text;

    @ToString.Exclude
    @Setter(AccessLevel.NONE)
    private Set<Document> children = new HashSet<>();

    public Document createChild() {
        Document child = new Document();
        fieldsToCopy.forEach(fieldName -> {
            String fieldValue = metadata.get(fieldName);
            if (fieldName != null) {
                child.getMetadata().put(fieldName, fieldValue);
            }
        });
        child.setFieldsToCopy(fieldsToCopy);
        child.setId(UUID.randomUUID().toString());
        children.add(child);
        return child;
    }

    public void setFieldsToCopy(String ... fieldsToCopy) {
        this.fieldsToCopy.addAll(Arrays.asList(fieldsToCopy));
    }

    public void setFieldsToCopy(Collection<String> fieldsToCopy) {
        this.fieldsToCopy.addAll(fieldsToCopy);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Document document = (Document) o;
        return id.equals(document.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
