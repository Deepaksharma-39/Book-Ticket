package com.masai.usecases;

import java.util.Scanner;

import com.masai.bean.Bus;
import com.masai.bean.Ticket;
import com.masai.customerDAO.CustomerDAO;
import com.masai.customerDAO.CustomerDAOimpl;

public class CustomerSigninOption {

    
    public void CustomerOptions(int customerid) {
        
        Scanner input= new Scanner(System.in);
        System.out.println("******************************************");
        
        System.out.println("What would you like to do? \n"
               + "1. Book Ticket \n"
               + "2. Cancel Ticket \n "
               + "3. Check Ticket Status \n"
               + "4. Exit");
        
        int custChoice=input.nextInt();
        
        CustomerSigninOption cso= new CustomerSigninOption();
        
        switch(custChoice) {
        
        case 1:
            System.out.println("Welcome To Online Bus Ticket Booking portal");
            
            SearchBus search= new SearchBus();
            Bus bus= search.geBus();
            
            if(bus!=null) {
                CustomerDAO dao=new CustomerDAOimpl();
                Ticket ticket=dao.BookTicket(customerid, bus.getBusno());
                System.out.println(ticket);
            }
            cso.CustomerOptions(customerid);
            break;
            
        case 2:
            System.out.println("Enter ticketid to cancel ticket");
            int ticketid=input.nextInt();
            
            
        case 3:
            break;
            
            
        }
    }
}
