package com.masai.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.masai.bean.Bus;
import com.masai.utility.DBconnection;

public class CustomerDAOimpl implements CustomerDAO {

	@Override
	public String searchBus(String source, String destination) {
		// TODO Auto-generated method stub
		List<Bus> buses=null;
		
		
		DBconnection.provideConnection();
		try(Connection con=DBconnection.provideConnection()){
			
			String query="Select * from buses b,busdetails bd where b.bus_no=bd.bus_no  And b.source=? And b.destination=?";
			
			PreparedStatement ps= con.prepareStatement(query);
			ps.setString(1, source);
			ps.setString(2, destination);
			
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()) {
				String busname= rs.getString("busname");
				String busNo=rs.getString("busNo");
				
			}
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	
		
		
		return buses;
	}

}
