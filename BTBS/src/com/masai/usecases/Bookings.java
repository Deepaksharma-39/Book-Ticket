package com.masai.usecases;

import java.util.Scanner;

import com.masai.adminDAO.AdminDAO;
import com.masai.adminDAO.AdminDAOimpl;
import com.masai.exceptions.AdminException;

public class Bookings {
    
    

    public void confirmTicket() {
        System.out.println("Enter Username");
        Scanner input= new Scanner(System.in);
        
        String busno=input.next();
        
        
        AdminDAO dao= new AdminDAOimpl();
        try {
            String msg=dao.showBookings(busno);
            System.out.println(msg);
        } catch (AdminException e) {
            System.out.println(e.getMessage());
            
        }
        
        
    }
}
