package patterns.iterator;

public interface DocumentIterator {

    boolean hasNext();
    Document getNext();
    void reset();

}
