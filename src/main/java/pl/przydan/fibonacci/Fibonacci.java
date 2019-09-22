package pl.przydan.fibonacci;

import java.math.BigDecimal;

public interface Fibonacci {
    BigDecimal getN(int n);

    default void validateArgument(int n) {
        if (n < 0) {
            throw new FibonacciArgumentException("Argument nie możę być liczbą ujemną !!!");
        }
    }
}
