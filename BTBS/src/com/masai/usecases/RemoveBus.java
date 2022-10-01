package com.masai.usecases;

import java.util.Scanner;

import com.masai.adminDAO.AdminDAO;
import com.masai.adminDAO.AdminDAOimpl;

public class RemoveBus {

    public boolean Removebus() {
        boolean msg=false;
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter busno of Bus you want to delete");
        String busno=input.next();
        
        AdminDAO dao=new AdminDAOimpl();
        msg=dao.removeBus(busno);
        if(msg==false) {
            System.out.println("Enter a Valid bus no");
            
        }
        
        return msg;
    }
}
