package com.masai.usecases;

import java.util.Scanner;


import com.masai.bean.Customer;
import com.masai.customerDAO.CustomerDAO;
import com.masai.customerDAO.CustomerDAOimpl;
import com.masai.exceptions.CustomerException;

public class CustomerSignUp {

    public int SignUp() throws CustomerException {
        int customerid=0;
        String msg= "SignUp Failed";
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Enter Name");
        String name= input.nextLine();
        
        System.out.println("Enter Username");
        String username= input.next();
        
        System.out.println("Enter Password");
        String Password=input.next();
        
        
        
        Customer customer=new Customer(name, 0, username, Password);
        
        CustomerDAO dao= new CustomerDAOimpl();
        customerid=dao.registerCustomer(customer);
        if(customerid>0) {
        }else {
            CustomerException ce= new CustomerException(msg);
            throw ce;
         
        }
        
        
        return customerid;
        
    }
}
