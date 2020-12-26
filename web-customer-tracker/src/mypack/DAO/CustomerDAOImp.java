package mypack.DAO;

import java.util.List;

import org.hibernate.Session;

import org.hibernate.SessionFactory;

import org.hibernate.query.Query;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import mypack.entity.Customer;

@Repository
public class CustomerDAOImp implements CustomerDAO {
	
	@Autowired
	private SessionFactory sessionfactory;

	@Override
	
	public List<Customer> getCustomers() {
		
		Session currentsession=sessionfactory.getCurrentSession();
		
		Query<Customer> query=currentsession.createQuery("from Customer order by lastName", Customer.class);
		
		List<Customer> customers=query.getResultList();
		
		return customers;
	}

	@Override
	public void saveCustomer(Customer thecustomer) {
		
		Session currentsession=sessionfactory.getCurrentSession();
		
		currentsession.saveOrUpdate(thecustomer);
		
	}

	@Override
	public Customer getCustomer(int customer_Id) {
		
		Session currentsession=sessionfactory.getCurrentSession();
		
		Customer thecustomer=currentsession.get(Customer.class, customer_Id);
		
		return thecustomer;
		
	}

	@Override
	public void deleteCustomer(int customer_Id) {
		
		Session currentsession=sessionfactory.getCurrentSession();
		
	    Query thequery=currentsession.createQuery("delete from Customer where id=:customerId");
	    
	    thequery.setParameter("customerId", customer_Id);
	    
	    thequery.executeUpdate();
		
		
	}
	
	

}
