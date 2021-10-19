package patterns.facade;

public class NotEnoughProducts extends Exception {
    @Override
    public String getMessage() {
        return "Not enough products in the store";
    }
}
