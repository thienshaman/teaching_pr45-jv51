package repository;

import entity.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    public List<Customer> findByName(String name);
    public List<Customer> findByPhoneOrEmail(String phone, String email);

    @Query(value = "SELECT * FROM customer WHERE YEAR(NOW()) - YEAR(birthdate) >= 20 AND YEAR(NOW()) - YEAR(birthdate) <= 30", nativeQuery = true)
    public List<Customer> getCustomerFrom20To30();
}
