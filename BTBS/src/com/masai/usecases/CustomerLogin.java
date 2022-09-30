package com.masai.usecases;

import java.util.Scanner;


import com.masai.bean.Customer;
import com.masai.customerDAO.CustomerDAO;
import com.masai.customerDAO.CustomerDAOimpl;
import com.masai.exceptions.CustomerException;

public class CustomerLogin {

    public Boolean signin() {
        boolean result=false;
        Scanner input=new Scanner(System.in);
        String msg="Signin Failed";
        
        System.out.println("Enter Customer username");
        String custUsername=input.next();
        
        System.out.println("Enter Password");
        String password=input.next();
        
        CustomerDAO cdao= new CustomerDAOimpl();
        try {
            Customer customer=cdao.CustomerLogin(custUsername, password);
            System.out.println("***************************************");
            System.out.println("Welcome "+customer.getName());
            msg="Signin Successful";
            result=true;
            
        } catch (CustomerException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
        
        System.out.println(msg);
        return result;
    }
    
    
}
