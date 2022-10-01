package com.masai.usecases;

import java.util.Scanner;

import com.masai.adminDAO.AdminDAO;
import com.masai.adminDAO.AdminDAOimpl;
import com.masai.bean.Admin;
import com.masai.exceptions.AdminException;

public class AdminSingin {

    
    
    public Boolean signin() {
        boolean result=false;
        
        Scanner input=new Scanner(System.in);
        String msg="Signin Failed";
        
        System.out.println("Enter Admin username");
        String adminUsername=input.next();
        
        System.out.println("Enter Password");
        String adminPassword=input.next();
        
        AdminDAO ado=new AdminDAOimpl();
        try {
            Admin adm=ado.adminLogin(adminUsername, adminPassword);
            System.out.println("***************************************");
            System.out.println("Welcome "+adm.getName());
            msg="Signin Successful";
            result=true;
            
        } catch (AdminException e) {
            
            System.out.println(e.getMessage());
        }
        
        
        System.out.println(msg);
        
        return result;
    }
}
