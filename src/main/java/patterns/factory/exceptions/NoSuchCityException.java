package patterns.factory.exceptions;

public class NoSuchCityException extends Exception{
    @Override
    public String getMessage() {
       return "Error: No such city";
    }
}
