/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.computer.store;

import java.util.Scanner;

/**
 *
 * @author SOAQ COMPUTER
 */
public class OnlineComputerStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Labtob Dell=new Labtob();
        Dell.screen_type="not touch";
        Dell.colour="Black";
        Dell.price=12000;
        Dell.generation="ninth generation";
        Dell.productiondate=2020;
           
        Labtob HP=new Labtob();
        HP.screen_type="touch screen";
        HP.colour="white";
        HP.price=15000;
        HP.generation="eighth generation";
        HP.productiondate=2019;
        
        
        System.out.println("for Dell information press 1");
        System.out.println("for HP information press 2");
        
        int n=input.nextInt();
        switch(n){
            case 1: System.out.println("you have entered Dell information");
                System.out.println("screen type: "+Dell.getScreen_type());
                System.out.println("the colour : : "+Dell.getColour());
                System.out.println("price: "+Dell.getPrice());
                System.out.println("generation: "+Dell.getGeneration());
                System.out.println("productiondate: "+Dell.getProductiondate());
                System.out.println("age of the labtob: "+Dell.age(Dell.getProductiondate()));
                break;
                
                
            case 2: System.out.println("you have entered HP information");
                System.out.println("screen type: "+HP.getScreen_type());
                System.out.println("the colour : : "+HP.getColour());
                System.out.println("price: "+HP.getPrice());
                System.out.println("generation: "+HP.getGeneration());
                System.out.println("productiondate: "+HP.getProductiondate());
                System.out.println("age of the labtob: "+HP.age(HP.getProductiondate()));
                break;
                
            default: System.out.println("you have entered wrong number");
        }
        
    }
    
}
