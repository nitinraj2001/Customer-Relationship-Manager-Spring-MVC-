package mypack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import mypack.DAO.CustomerDAO;

import mypack.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	//need to inject customer data access object
	
	@Autowired
	private CustomerDAO customerdao;
	
	
	
	

	@Override
	@Transactional
	public List<Customer> getCustomers() {
		
       return customerdao.getCustomers();
       
	}





	@Override
	@Transactional
	public void saveCustomer(Customer thecustomer) {
		
		customerdao.saveCustomer(thecustomer);
		
	}





	@Override
	@Transactional
	public Customer getCustomer(int customer_Id) {
		
		return customerdao.getCustomer(customer_Id);
	}





	@Override
	@Transactional
	public void deleteCustomer(int customer_Id) {
		
		customerdao.deleteCustomer(customer_Id);
		
		
	}
   
}
