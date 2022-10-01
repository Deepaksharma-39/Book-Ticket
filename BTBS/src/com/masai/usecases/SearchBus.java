package com.masai.usecases;


import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.masai.bean.Bus;
import com.masai.customerDAO.CustomerDAO;
import com.masai.customerDAO.CustomerDAOimpl;
import com.masai.exceptions.CustomerException;

public class SearchBus {
    
    public Bus  geBus() {
        
        Bus bus=null;
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter Source Location");
        String source=input.next();
        
        System.out.println("Enter Destination Location");
        String destination=input.next();

        
        CustomerDAO dao=new CustomerDAOimpl();
        
        try {
           List<Bus>buses= dao.SearchBus(source, destination);
           
           int sno=1;
           Map<Integer, Bus> busDetails= new LinkedHashMap<>();
           
           for(int i=0;i<buses.size();i++) {
               busDetails.put(sno, buses.get(i));
           }
           
           
               System.out.println("Select any one option");
               int option=input.nextInt();
               
               if(busDetails.containsKey(option)) {
                   bus=busDetails.get(option);
               }
               
           
           
           
        } catch (CustomerException e) {
            System.out.println(e.getMessage());
        }
        
        
        return bus;
    }

}
