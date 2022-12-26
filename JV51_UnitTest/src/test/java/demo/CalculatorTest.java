package demo;

import org.junit.Test;

import static org.junit.Assert.*;
public class CalculatorTest {

    @Test
    public void calculatorMax_UC01() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.max(7, 8);
        assertEquals(8, actualResult);
    }

    @Test
    public void calculatorMax_UC02() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.max(10, 7);
        assertEquals(10, actualResult);
    }

    @Test
    public void calculatorMax_UC03() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.max(-5, -2);
        assertEquals(-2, actualResult);
    }
}
