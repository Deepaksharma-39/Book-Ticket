package com.masai.customerDAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.bean.Bus;
import com.masai.bean.Customer;
import com.masai.bean.Ticket;
import com.masai.exceptions.CustomerException;
import com.masai.utility.DatabaseConn;

public class CustomerDAOimpl implements CustomerDAO {

    @Override
    public int registerCustomer(Customer customer) {
        int customerid=0;
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
            
            
            String query2="select customerid from customer where username=? and password=?";
            PreparedStatement ps1=con.prepareStatement(query2);
            ps1.setString(1,customer.getUsername());
            ps1.setString(2, customer.getPassword());
            
            ResultSet rs=ps1.executeQuery();
            
            if(rs.next()) {
                customerid=rs.getInt("customerid");
                System.out.println(msg);
            }
            else {
                
            }
        }catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    
        
        
        return customerid;
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
                CustomerException ae= new CustomerException("Incorrect Username/Password");
                throw ae;
                
            }
            
        }catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        
        
        
        return customer;
    }

    @Override
    public String CancelTicket(String tickectid) {
        
        return null;
    }

   
    @Override
    public List<Bus> SearchBus(String source, String destination) throws CustomerException {
        List<Bus> buses=new ArrayList<>();
        
        try(Connection con=DatabaseConn.provideConnection()){
            
            String query="select * from bus where source=? and destination =?";
            
            PreparedStatement ps= con.prepareStatement(query);
            ps.setString(1, source);
            ps.setString(2, destination);
            
            ResultSet rs=ps.executeQuery();
            
                
                while(rs.next()) {
                    String busno= rs.getString("busno");
                    String busname= rs.getString("name");
                    Date ddate=rs.getDate("departureDate");
                    String dtime=rs.getString("departureTime");
                    int AvailableSeats=rs.getInt("Availableseats");
                    int totalSeats=rs.getInt("totalseats");
                    String username=rs.getString("username");
                    int fare=rs.getInt("fare");
                    
                    Bus bus= new Bus(busno, busname, source, destination, ddate, dtime, totalSeats, AvailableSeats, username, fare);
                    buses.add(bus);
                    
                    }
                
            
            
        }catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        
        
        
        return buses;
    }

    @Override
    public Ticket BookTicket(int customerID, String busnum) {
        
        Ticket ticket=null;
        
        
        try(Connection con=DatabaseConn.provideConnection()){
            
            String query="insert into ticket(customerid,busNo) values(?,?)";
            
            PreparedStatement ps= con.prepareStatement(query);
            ps.setInt(1, customerID);
            ps.setString(2, busnum);
            
            int res= ps.executeUpdate();
            
            
            
            
            String query2="select ticketid from ticket where customerid=? and busno=?";
            PreparedStatement ps1=con.prepareStatement(query2);
            ps1.setInt(1,customerID);
            ps1.setString(2, busnum);
            
            ResultSet rs=ps1.executeQuery();
            
            if(rs.next() && res>0) {
                int ticketid=rs.getInt("ticketid");
                int customerid=rs.getInt("customerid");
                String busnumb=rs.getString("busno");
                ticket=new Ticket(ticketid, customerid, busnumb);
            }
            else {
                
            }
        }catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    
        
        
        return ticket;
    }

}
