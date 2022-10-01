package com.masai.usecases;

import java.util.List;
import java.util.Scanner;

import com.masai.adminDAO.AdminDAO;
import com.masai.adminDAO.AdminDAOimpl;
import com.masai.bean.Bus;
import com.masai.exceptions.AdminException;

public class ShowAdminBuses {

    public List<Bus> showBus(){
        List<Bus> buses= null;
        
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter Admin username");
        
        String username=input.next();
        AdminDAO dao= new AdminDAOimpl();
        try {
            
            buses= dao.showBus(username);
            
        } catch (AdminException e) {
            
            System.out.println(e.getMessage());
        }
        
        
        
        
        return buses;
    }
}
