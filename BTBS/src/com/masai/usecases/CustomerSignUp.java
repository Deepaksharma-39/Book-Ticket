package com.masai.usecases;

import java.util.Scanner;


import com.masai.bean.Customer;
import com.masai.customerDAO.CustomerDAO;
import com.masai.customerDAO.CustomerDAOimpl;

public class CustomerSignUp {

    public String SignUp() {
        String msg= "SignUp Failed";
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("WELCOME TO ADMIN SIGNUP PAGE");
        
        System.out.println("Enter Name");
        String name= input.nextLine();
        
        System.out.println("Enter Username");
        String username= input.next();
        
        System.out.println("Enter Password");
        String Password=input.next();
        
        Customer customer=new Customer(name, 0, username, Password);
        
        CustomerDAO dao= new CustomerDAOimpl();
        msg=dao.registerCustomer(customer);
        
        return msg;
    }
}
