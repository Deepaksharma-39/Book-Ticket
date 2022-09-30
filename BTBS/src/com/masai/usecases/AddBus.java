package com.masai.usecases;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
        
        
        
        
       
        Date departureDate=null;
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Enter Departure date (DD/MM/YYYY)");
        while(departureDate == null)
        {
            try
            {
                String dDate=input.next();
                departureDate = df.parse(dDate);
            }
            catch(ParseException e)
            {
                System.out.println("Please enter a valid date! Format is DD/MM/YYYY");
            }
        }
       
        Date departureTime=null;
        DateFormat dft = new SimpleDateFormat("hh.mm");
        
        System.out.println("Enter Departure Time (HH.MM) 24hr format");
        while(departureTime == null)
        {
            try
            {
                String dTime=input.next();
                departureTime = dft.parse(dTime);
            }
            catch(ParseException e)
            {
                System.out.println("Please enter a valid Time! Format is HH/MM (24hr format)");
            }
        }
        
        
        
        
        System.out.println("Enter Bus Capacity");
        int capacity=input.nextInt();
        
        
        System.out.println("Avaiable Seats");
        int availableSeats=input.nextInt();
        
        
        System.out.println("Enter tickect Price per Person");
        int fare=input.nextInt();
        
        System.out.println("Confirm yor username");
        String username=input.next();
        
        
        Bus bus=new Bus(busno, busName, source, destination, departureDate, departureTime, capacity, availableSeats, username, fare);
        
        
        AdminDAO dao=new AdminDAOimpl();
        String res=dao.addBus(bus);
        
        
        return msg;               
        
    }
}
