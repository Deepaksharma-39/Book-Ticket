package com.masai.adminDAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.masai.bean.Admin;
import com.masai.bean.Bus;
import com.masai.exceptions.AdminException;
import com.masai.utility.DatabaseConn;

public  class AdminDAOimpl implements AdminDAO {

	
	@Override
	public String registerAdmin(Admin admin) {
		
		String msg= "REGISTRATION UNSUCCESSFUL";
		
		
		try(Connection con=DatabaseConn.provideConnection()){
			
			String query="insert into Admin(name,username,password) values(?,?,?)";
			
			PreparedStatement ps= con.prepareStatement(query);
			ps.setString(1, admin.getName());
			ps.setString(2, admin.getUsername());
			ps.setString(3, admin.getPassword());
			
			int res= ps.executeUpdate();
			
			if(res>0) {
				msg="REGISTRATION SUCCESSFUL";
			}
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	
		
		
		return msg;	
	}

	@Override
	public Admin adminLogin(String username,String password) throws AdminException {
		
		Admin adm=null;
		
		try(Connection con=DatabaseConn.provideConnection()){
			
			String query="select * from admin where username = ? and password = ?";
			
			PreparedStatement ps= con.prepareStatement(query);
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
			    String name=rs.getString("name");
			    String username1=rs.getString("username");
			    String password1=rs.getString("password");
			    
			    adm= new Admin(name, username1, password1);
			}else {
			    AdminException ae= new AdminException("Incorrect Username");
			    throw ae;
			    
			}
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		return adm;
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
		try(Connection con=DatabaseConn.provideConnection()){
            
            String query="insert into bus values(?,?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement ps= con.prepareStatement(query);
            ps.setString(1, bus.getBusno());
            ps.setString(2, bus.getName());
            ps.setString(3, bus.getSource());
            ps.setString(4, bus.getDestination());
            ps.setDate(5,  (Date) bus.getDepaartureDate());
            ps.setDate(6, (Date) bus.getDepartureTime());
            ps.setInt(6, bus.getCapacity());
            ps.setInt(7, bus.getSeatsAvailable());
            ps.setString(8, bus.getUsername());
            ps.setInt(9, bus.getFare());
            
            
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
