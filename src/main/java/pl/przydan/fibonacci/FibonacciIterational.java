package pl.przydan.fibonacci;

import java.math.BigDecimal;

public class FibonacciIterational implements FibonacciInterface {
    @Override
    public BigDecimal getN(int n) {
        BigDecimal result = new BigDecimal(0);

        BigDecimal prev = new BigDecimal(1);

        for (int i = 1; i <= n ; i++) {
            BigDecimal temp = result;
            result = result.add(prev);
            prev = temp;
        }

        return result;
    }
}
