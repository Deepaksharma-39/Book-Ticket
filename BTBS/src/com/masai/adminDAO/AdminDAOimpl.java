package com.masai.adminDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.masai.bean.Admin;
import com.masai.bean.Bus;
import com.masai.utility.DatabaseConn;

public  class AdminDAOimpl implements AdminDAO {

	
	@Override
	public String registerAdmin(Admin admin) {
		
		String msg= "Regisration Unsuccessful";
		
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
		
		try(Connection con=DatabaseConn.provideConnection()){
			
			String query="select name,username from admin where username=? and password=?";
			
			PreparedStatement ps= con.prepareStatement(query);
			ps.setString(1, username);
			ps.setString(2, password);
			
			int res= ps.executeUpdate();
			
			if(res>0) {
				msg="login Successful";
			}else {
				msg="login failed";
			}
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		return msg;
	}

	@Override
	public List<Bus> showBus(String username) {
		List<Bus> buses=null;
		
		try(Connection con=DatabaseConn.provideConnection()){
			 
			String query="select * from bus where username=?";
			
			PreparedStatement ps= con.prepareStatement(query);
			ps.setString(1, username);
			
			ResultSet res= ps.executeQuery();
//			
//			
//			
//			Extracting data from sql
//			
//			
//			
			
			
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		return buses;
	}

	@Override
	public String addBus(Bus bus) {
		String msg="Error// Bus registration failed";
		
		
try(Connection con=DatabaseConn.provideConnection()){
			
			String query="insert into bus values(?,?,?,?,?,?,?)";
			
			PreparedStatement ps= con.prepareStatement(query);
//			
//			
//			set values
//			
//			
			
			int rs=ps.executeUpdate();
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		return msg;
	}

	@Override
	public String removeBus(String busNo) {
		
		String msg="Error// problem in removing bus";
				
				
//		DELETE FROM table_name WHERE condition
		try(Connection con=DatabaseConn.provideConnection()){
			
			String query="Delete from bus where busNo=?";
			
			PreparedStatement ps= con.prepareStatement(query);
//			
//			
//			set values
//			
//			
			
			int rs=ps.executeUpdate();
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
				return msg;
	}

	

}
