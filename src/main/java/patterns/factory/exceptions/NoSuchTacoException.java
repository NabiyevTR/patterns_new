package patterns.factory.exceptions;

public class NoSuchTacoException extends Exception{
    @Override
    public String getMessage() {
        return "Error: No such taco";
    }
}
