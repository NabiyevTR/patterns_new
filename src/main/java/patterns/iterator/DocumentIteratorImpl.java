package patterns.iterator;

import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;


public class DocumentIteratorImpl implements DocumentIterator {

    private int position = -1;
    private final List<Document> documentList = new ArrayList<>();

    public DocumentIteratorImpl(Document document) {
        documentList.add(document);
        documentList.addAll(getChildren(document));
    }

    private List<Document> getChildren(Document document) {
        List<Document> children = new ArrayList<>();
        document.getChildren().forEach(child -> {
            children.add(child);
            if (child.getChildren() != null && !child.getChildren().isEmpty()) {
                children.addAll(getChildren(child));
            }
        });
        return children;
    }

    @Override
    public boolean hasNext() {
        if (documentList.isEmpty()) return false;
        return position < documentList.size() - 1;
    }

    @Override
    public Document getNext() {
        return documentList.get(++position);
    }

    @Override
    public void reset() {
        position = -1;
    }
}
