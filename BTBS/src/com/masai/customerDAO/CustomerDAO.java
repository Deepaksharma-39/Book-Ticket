package com.masai.customerDAO;



import java.util.List;

import com.masai.bean.Bus;
import com.masai.bean.Customer;
import com.masai.bean.Ticket;
import com.masai.exceptions.CustomerException;


public interface CustomerDAO {
	
	public int registerCustomer(Customer customer);
	
	public Customer CustomerLogin(String username,String password) throws CustomerException;
	
	public String CancelTicket(String tickectid);
	
	
	public List<Bus> SearchBus(String source, String destination) throws CustomerException;

    public Ticket BookTicket(int customerID, String busnum);
	
	
	
	
	
	
	

}
