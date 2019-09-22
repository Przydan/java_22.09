package pl.przydan.fibonacci;

public class FibonacciArgumentException extends RuntimeException {
    // konstruktor dla klasy nadrzędnej
    public FibonacciArgumentException(String msg) {
        super(msg);
    }
}
