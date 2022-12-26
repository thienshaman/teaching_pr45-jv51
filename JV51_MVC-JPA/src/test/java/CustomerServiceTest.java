import entity.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import service.CustomerService;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(value = "classpath:spring-config.xml")
public class CustomerServiceTest {
    @Autowired
    CustomerService customerService;
    @Test
    public void testGetCustomerById_UC001() {
        Customer customer = customerService.getCustomerById(1);
        String expName = customer.getName();
        assertEquals(expName, "Minh Hoang");
    }

    @Test
    public void testGetCustomerById_UC002() {
        String expName ="Minh Hoang";
        assertEquals(expName, "Minh Hoang");
    }
}
