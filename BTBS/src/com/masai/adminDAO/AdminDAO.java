package com.masai.adminDAO;

import java.util.List;

import com.masai.bean.Admin;
import com.masai.bean.Bus;
import com.masai.exceptions.AdminException;

public interface AdminDAO {

	public String registerAdmin(Admin admin);
	
	public Admin adminLogin(String username, String password) throws AdminException;
	
	public List<Bus> showBus(String username);
	
	public String addBus(Bus bus);
	
	public String removeBus(String busNo);
	
	public String changeBusDetails(String busNo);
	
}
