package com.masai.adminDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.masai.bean.Admin;
import com.masai.bean.Bus;
import com.masai.utility.DatabaseConn;

public  class AdminDAOimpl implements AdminDAO {

	
	@Override
	public String registerAdmin(Admin admin) {
		
		String msg= "Regisration Unsuccessful";
		
		DatabaseConn.provideConnection();
		try(Connection con=DatabaseConn.provideConnection()){
			
			String query="insert into Admin(username,password) values(?,?)";
			
			PreparedStatement ps= con.prepareStatement(query);
			ps.setString(1, admin.getUsername());
			ps.setString(2, admin.getPassword());
			
			int res= ps.executeUpdate();
			
			if(res>0) {
				msg="Registration Successful";
			}
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	
		
		
		return msg;	
	}

	@Override
	public String adminLogin(String username,String password) {
		
		String msg="Login failed";
		
		
		
		
		return msg;
	}

	@Override
	public List<Bus> showBus(String username) {
		// TODO Auto-generated method stub
		List<Bus> buses=null;
		
		
		
		
		return buses;
	}

	@Override
	public String addBus(Bus bus) {
		String msg="Error// Bus registration failed";
		
		
		return msg;
	}

	@Override
	public String removeBus(String busNo) {
		
		String msg="Error// problem in removing bus";
				
				
				return msg;
	}

	@Override
	public String changeBusDetails(String busNo) {
		String msg="Bus modifications failed";
		
		
		
		return msg;
	}

}
