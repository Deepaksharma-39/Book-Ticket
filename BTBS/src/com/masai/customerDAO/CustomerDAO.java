package com.masai.customerDAO;



import com.masai.bean.Customer;
import com.masai.exceptions.CustomerException;


public interface CustomerDAO {
	
	public String registerCustomer(Customer customer);
	
	public Customer CustomerLogin(String username,String password) throws CustomerException;
	
	public String CancelTicket(String tickectid);
	
	
	
	
	
	

}
