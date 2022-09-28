package com.masai.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.masai.bean.Admin;
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

}
