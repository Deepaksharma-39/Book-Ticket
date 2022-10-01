package com.masai.usecases;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.masai.adminDAO.AdminDAO;
import com.masai.adminDAO.AdminDAOimpl;
import com.masai.bean.Bus;

public class AddBus {

    public  String registerBus() {
        Scanner input=new Scanner(System.in);
        String msg="BUS REGISTRATION FAILED";
        
        
        System.out.println("Enter The Bus Details");
        
        System.out.println("Enter Bus number");
        String busno=input.next();
        
        System.out.println("Enter Bus Name");
        String busName=input.next();
        
        System.out.println("Enter Source");
        String source=input.next();
        
        System.out.println("Enter Destination");
        String destination=input.next();
        
        
        System.out.println("Enter Departure date (DD/MM/YYYY)");
        String dDate=input.next();
        
        SimpleDateFormat format = new SimpleDateFormat( "MM/dd/yyyy" );
        
        java.sql.Date sqlDate=null;
        
        try {
            java.util.Date myDate = format.parse( dDate );
            sqlDate = new java.sql.Date( myDate.getTime() );
        } catch (ParseException e) {
            
            System.out.println(e.getMessage());
        }
        
        
        System.out.println("Enter Departure Time (HHMM) 24hr format");
        String dTime=input.next();
        
        System.out.println("Enter Bus Capacity");
        int capacity=input.nextInt();
        
        
        System.out.println("Avaiable Seats");
        int availableSeats=input.nextInt();
        
        
        System.out.println("Enter tickect Price per Person");
        int fare=input.nextInt();
        
        System.out.println("Confirm yor username");
        String username=input.next();
        
        
        Bus bus=new Bus(busno, busName, source, destination, sqlDate, dTime, capacity, availableSeats, username, fare);
        
        
        AdminDAO dao=new AdminDAOimpl();
        msg=dao.addBus(bus);
        
        return msg;               
        
    }
}
