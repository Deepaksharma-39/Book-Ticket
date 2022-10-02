package com.masai;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.masai.bean.Ticket;
import com.masai.utility.DatabaseConn;

public class Something {

    public static void main(String[] args) {
            try(Connection con=DatabaseConn.provideConnection()){
            
            
            
            
                String query2="select c.name, \r\n"
                        + "b.name, b.availableseats, b.source, b.destination, b.departuredate, b.departuretime, b.availableseats\r\n"
                        + "from customer c INNER JOIN bus b INNER JOIN \r\n"
                        + "ticket t ON c.customerid = t.customerid AND b.busno=t.busno";
                PreparedStatement ps1=con.prepareStatement(query2);
            ResultSet rs=ps1.executeQuery();
            
            
            }catch(SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

