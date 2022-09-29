package com.masai.customerDAO;

import java.util.List;


import com.masai.bean.Bus;
import com.masai.bean.Customer;

public interface CustomerDAO {
	
	public String registerCustomer(Customer customer);
	
	public String CustomerLogin(String username,String password);
	
	public List<Bus> showBus(String source,String destination);
	
	
	
	
	
	

}
