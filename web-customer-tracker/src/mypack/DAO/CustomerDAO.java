package mypack.DAO;

import java.util.List;

import mypack.entity.Customer;

public interface CustomerDAO {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer thecustomer);

	public Customer getCustomer(int customer_Id);

	public void deleteCustomer(int customer_Id);
		
	

}
