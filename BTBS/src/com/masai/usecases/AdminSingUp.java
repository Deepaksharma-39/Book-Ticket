package com.masai.usecases;

import java.util.Scanner;

import com.masai.adminDAO.AdminDAO;
import com.masai.adminDAO.AdminDAOimpl;
import com.masai.bean.Admin;

public class AdminSingUp {

    public  String signup() {
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Enter Name");
        String name= input.nextLine();
        
        System.out.println("Enter Username");
        String username= input.next();
        
        System.out.println("Enter Password");
        String Password=input.next();
        
        Admin admin=new Admin(name, username, Password);
                    
        AdminDAO admindao= new AdminDAOimpl();
        String msg=admindao.registerAdmin(admin);
        return msg;
    }
    
}
