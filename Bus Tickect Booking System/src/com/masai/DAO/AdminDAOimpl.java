package com.masai.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.masai.bean.Admin;
import com.masai.bean.Bus;
import com.masai.utility.DBconnection;

public class AdminDAOimpl implements AdminDAO {

	
	@Override
	public String registerAdmin(Admin admin) {
		
		String msg= "Regisration Unsuccessful";
		
		DBconnection.provideConnection();
		try(Connection con=DBconnection.provideConnection()){
			
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
	public String registerBus(Bus bus) {
		
		String msg= "Bus Regisration Unsuccessful";
		
		DBconnection.provideConnection();
		try(Connection con=DBconnection.provideConnection()){
			
			String query="insert into buses values(?,?,?,?,?,?,?,?)";
			
			PreparedStatement ps= con.prepareStatement(query);
			
			ps.setString(1, bus.getBusNo());
			ps.setString(2, bus.getBusName());
			ps.setBoolean(3, bus.isAc());
			ps.setString(4, bus.getSource());
			ps.setString(5, bus.getDestination());
			ps.setString(6, bus.getDeparture());
			ps.setString(7, bus.getArrival());
			ps.setInt(8, bus.getTotalSeats());
			
			int res= ps.executeUpdate();
			
			if(res>0) {
				msg="Registration Successful";
			}
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	
		
		
		return msg;	
	}

}
