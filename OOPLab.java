/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.lab;

import java.util.Scanner;

/**
 *
 * @author SOAQ COMPUTER
 */
public class OOPLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Medicine Bronchicums=new Medicine();
        Medicine Panadol=new Medicine();
        Medicine Relax=new Medicine();
        
        
        Bronchicums.type="drink medicine";
        Bronchicums.production_date=2020;
        Bronchicums.expiration_date=2022;
        Bronchicums.price=30;
        Bronchicums.side_effects="dizziness";
        Bronchicums.notes="shake before use";
        
        
        Panadol.type="pills";
        Panadol.production_date=2021;
        Panadol.expiration_date=2023;
        Panadol.price=60;
        Panadol.side_effects="no side effects";
        Panadol.notes="don't forget to drink enough water";
        
        
        Relax.type="cream";
        Relax.production_date=2019;
        Relax.expiration_date=2024;
        Relax.price=100;
        Relax.side_effects="no side effects";
        Relax.notes="have a strong smell";
        
        
        System.out.println("Welcome!");
        System.out.println("Enter no.1 for more details about Bronchicums ");
        System.out.println("Enter no.2 for more details about Panadol ");
        System.out.println("Enter no.3 for more details about Relax ");
        
        int n= input.nextInt();
        switch(n){
            case 1: System.out.println("Type: "+ Bronchicums.getType());
                System.out.println("Production Date: "+ Bronchicums.getProduction_date());
                System.out.println("Expiration Date: "+ Bronchicums.getExpiration_date());
                System.out.println("Side Effects: "+ Bronchicums.getSide_effects());
                System.out.println("Notes: "+ Bronchicums.getNotes());
                break;
                
            case 2: System.out.println("Type: "+ Panadol.getType());
                System.out.println("Production Date: "+ Panadol.getProduction_date());
                System.out.println("Expiration Date: "+ Panadol.getExpiration_date());
                System.out.println("Side Effects: "+ Panadol.getSide_effects());
                System.out.println("Notes: "+ Panadol.getNotes());
                break;
                 
            case 3: System.out.println("Type: "+ Relax.getType());
                System.out.println("Production Date: "+ Relax.getProduction_date());
                System.out.println("Expiration Date: "+ Relax.getExpiration_date());
                System.out.println("Side Effects: "+ Relax.getSide_effects());
                System.out.println("Notes: "+ Relax.getNotes());
                break;
                
            default: System.out.println("Sorry you have entered wrong number");
                
        }
        
    }
    
}
