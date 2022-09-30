package com.masai.usecases;

import java.util.Scanner;

public class CustomerSigninOption {

    
    public void CustomerOptions() {
        Scanner input= new Scanner(System.in);
        System.out.println("******************************************");
        
        System.out.println("What would you like to do? \n"
               + "1. Book Ticket \n"
               + "2. Cancel Ticket \n"
               + "3. Exit");
        
        int custChoice=input.nextInt();
        
        switch(custChoice) {
        
        case 1:
            
        }
    }
}
