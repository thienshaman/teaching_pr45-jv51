package service;

import entity.Customer;

import java.util.List;

public interface CustomerService {
    public List<Customer> getAllCustomers();
    public void deleteStudentById(int id);
    public void addCustomer(Customer customer);
    public Customer getCustomerById(int id);
}
