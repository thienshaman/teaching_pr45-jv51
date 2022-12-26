package demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:beans.xml")
public class CalculatorTest {
    @Autowired
    Calculator calculator;
    @Test
    public void tetsSum_UC001() {
        int expResult = calculator.sum(10, 5);
        assertEquals(expResult, 15);
    }
}
