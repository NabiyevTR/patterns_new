package patterns.iterator;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Document rootDoc = new Document();
        rootDoc.setId("root");
        rootDoc.setFieldsToCopy("direction");
        Map<String, String> rootDocMetadata = new HashMap<>();
        rootDocMetadata.put("direction", "analytic files");
        rootDocMetadata.put("type", "application/pdf");
        rootDoc.setMetadata(rootDocMetadata);
        rootDoc.setText("Root file text");
        rootDoc.createChild();
        Document child = rootDoc.createChild();
        child.createChild();

        DocumentIterator iterator = new DocumentIteratorImpl(rootDoc);
        while (iterator.hasNext()) {
            log.info("id: {}", iterator.getNext().getId());
        }
    }
}
