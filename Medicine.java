/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.lab;

/**
 *
 * @author SOAQ COMPUTER
 */
public class Medicine {
    String type;
    int production_date;
    int expiration_date;
    int price;
    String side_effects;
    String notes;
    
    String getType (){
        return type;
    }
    
    int getProduction_date (){
        return production_date;
    }
    int getExpiration_date (){
        return expiration_date;
    }
    String getSide_effects (){
        return side_effects;
    }
    
    String getNotes (){
        return notes;
    }
}

