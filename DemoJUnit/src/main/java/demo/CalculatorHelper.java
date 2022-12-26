package demo;

import org.springframework.stereotype.Repository;

@Repository
public class CalculatorHelper {
    public int sum(int a, int b) {
        return a + b;
    }
}
