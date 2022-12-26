package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Calculator {
    @Autowired
    CalculatorHelper calculatorHelper;
    public int sum(int a, int b) {
        return calculatorHelper.sum(a, b);
    }
}
