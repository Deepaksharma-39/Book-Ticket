package com.masai.adminDAO;

import java.util.List;

import com.masai.bean.Admin;
import com.masai.bean.Bus;

public interface AdminDAO {

	public String registerAdmin(Admin admin);
	
	public String adminLogin(String username, String password);
	
	public List<Bus> showBus(String username);
	
	public String addBus(Bus bus);
	
	public String removeBus(String busNo);
	
	public String changeBusDetails(String busNo);
	
}
