/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.computer.store;

import java.util.Date;

/**
 *
 * @author SOAQ COMPUTER
 */
public class Labtob {
    String screen_type;
    String colour;
    int price;
    int productiondate;
    String generation;
    
    Date d=new Date();
    int year=d.getYear()+1900;
    int age(int productiondate){
        return year-productiondate;
    }
    
    String getScreen_type()
    {
        return screen_type;
    }
    
    String getColour()
    {
        return colour;
    }
    
    int getPrice()
    {
        return price;
    }
    int getProductiondate()
    {
        return productiondate;
        
    }
    String getGeneration()
    {
        return generation;
    }
    
   
}
