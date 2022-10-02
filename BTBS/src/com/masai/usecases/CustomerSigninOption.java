package com.masai.usecases;

import java.util.List;
import java.util.Scanner;

import com.masai.bean.Bus;
import com.masai.bean.Ticket;
import com.masai.customerDAO.CustomerDAO;
import com.masai.customerDAO.CustomerDAOimpl;
import com.masai.exceptions.CustomerException;

public class CustomerSigninOption {

    
    public void CustomerOptions(int customerid) {
        
        Scanner input= new Scanner(System.in);
        System.out.println("******************************************");
        
        System.out.println("What would you like to do? \n"
               + "1. Book Ticket \n"
               + "2. Cancel Ticket \n "
               + "3. Booking History \n"
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
                Ticket ticket=dao.BookTicket(customerid, bus);
                System.out.println("**************************************");
                System.out.println("YOUR TICKET");
                System.out.println(ticket);
                System.out.println("Your tickets will be confirmed shortly");
            }
            cso.CustomerOptions(customerid);
            break;
            
        case 2:
            System.out.println("Enter ticketid to cancel ticket");
            int ticketid=input.nextInt();
            CustomerDAO cdao=new CustomerDAOimpl();
            String msg= cdao.CancelTicket(ticketid);
            System.out.println(msg);
            cso.CustomerOptions(customerid);
            
            
        case 3:
            
            
            CustomerDAO daoc=new CustomerDAOimpl();
                try {
                    List<Ticket> tickets=daoc.showstatus(customerid);
                    tickets.forEach(t->System.out.println(t));
                } catch (CustomerException e) {
                    System.out.println(e.getMessage());
                }
                
                cso.CustomerOptions(customerid);
            break;
            
        case 4:
            break;
        }
    }
}
