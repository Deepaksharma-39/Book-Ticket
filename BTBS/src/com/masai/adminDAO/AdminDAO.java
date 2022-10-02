package com.masai.adminDAO;

import java.util.List;

import com.masai.bean.Admin;
import com.masai.bean.Bus;
import com.masai.bean.Ticket;
import com.masai.exceptions.AdminException;

public interface AdminDAO {

	public String registerAdmin(Admin admin);
	
	public Admin adminLogin(String username, String password) throws AdminException;
	
	public List<Bus> showBus(String username) throws AdminException;
	
	public String addBus(Bus bus);
	
	public Boolean removeBus(String busNo);
	
	public String showBookings(String busNo) throws AdminException;
	
	
	
	
}
