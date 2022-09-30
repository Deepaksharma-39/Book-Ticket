package com.masai.customerDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.masai.bean.Customer;
import com.masai.exceptions.CustomerException;
import com.masai.utility.DatabaseConn;

public class CustomerDAOimpl implements CustomerDAO {

    @Override
    public String registerCustomer(Customer customer) {
        String msg= "REGISTRATION UNSUCCESSFUL";
        
        
        try(Connection con=DatabaseConn.provideConnection()){
            
            String query="insert into Customer(name,username,password) values(?,?,?)";
            
            PreparedStatement ps= con.prepareStatement(query);
            ps.setString(1, customer.getName());
            ps.setString(2, customer.getUsername());
            ps.setString(3, customer.getPassword());
            
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
    public Customer CustomerLogin(String username, String password) throws CustomerException {
    Customer customer=null;
        
        try(Connection con=DatabaseConn.provideConnection()){
            
            String query="select * from Customer where username = ? and password = ?";
            
            PreparedStatement ps= con.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            
            ResultSet rs=ps.executeQuery();
            
            if(rs.next()) {
                String name=rs.getString("name");
                int customerid=rs.getInt("customerid");
                String username1=rs.getString("username");
                String password1=rs.getString("password");
                
                customer= new Customer(name, customerid, username1, password1);
            }else {
                CustomerException ae= new CustomerException("Incorrect Username");
                throw ae;
                
            }
            
        }catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        
        
        
        return customer;
    }

    @Override
    public String CancelTicket(String tickectid) {
        // TODO Auto-generated method stub
        return null;
    }

}
