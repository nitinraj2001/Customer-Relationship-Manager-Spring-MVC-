package mypack.service;

import java.util.List;

import mypack.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer thecustomer);

	public Customer getCustomer(int customer_Id);

	public void deleteCustomer(int customer_Id);

}
