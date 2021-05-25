/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toka;

import java.util.Scanner;

/**
 *
 * @author SOAQ COMPUTER
 */
public class people {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Human toka=new Human("female","white",160,80,"brown",2001);
      Human nada=new Human("female","white",174,60,"brown",2000);
      Human eslam=new Human("male","white",150,70,"black",2002);
      Human noah=new Human("male","blach",180,90,"brown",1990);
      
      Scanner input=new Scanner(System.in);
      System.out.println("plz choose no 1 for males or no 2 for females");
     int n= input.nextInt();
     if(n==2)
     {
          System.out.println("plz choose no 1 for toka or no 2 for nada");
          int x= input.nextInt();
          if(x==1)
          {
              System.out.println("information about toka");
              System.out.println("type: "+ toka.getType());
              System.out.println("skincolor: "+ toka.gettSkincolor());
              System.out.println("wight: "+ toka.getweight());
              System.out.println("height: "+ toka.getheight());
              System.out.println("eyecolor: "+ toka.getEyecolor());
              System.out.println("birthdate: "+ toka.getBirthdate());
          }
          else {
              System.out.println("information about nada");
              System.out.println("type: "+ nada.getType());
              System.out.println("skincolor: "+ nada.gettSkincolor());
              System.out.println("wight: "+ nada.getweight());
              System.out.println("height: "+ nada.getheight());
              System.out.println("eyecolor: "+ nada.getEyecolor());
              System.out.println("birthdate: "+ nada.getBirthdate());
          }
     }
     else{
          System.out.println("plz choose no 1 for eslam or no 2 for noah");
          int x= input.nextInt();
          if(x==1)
          {
              System.out.println("information about eslam");
              System.out.println("type: "+ eslam.getType());
              System.out.println("skincolor: "+ eslam.gettSkincolor());
              System.out.println("wight: "+ eslam.getweight());
              System.out.println("height: "+ eslam.getheight());
              System.out.println("eyecolor: "+ eslam.getEyecolor());
              System.out.println("birthdate: "+ eslam.getBirthdate());
          }
          else {
              System.out.println("information about noah");
              System.out.println("type: "+ noah.getType());
              System.out.println("skincolor: "+ noah.gettSkincolor());
              System.out.println("wight: "+ noah.getweight());
              System.out.println("height: "+ noah.getheight());
              System.out.println("eyecolor: "+ noah.getEyecolor());
              System.out.println("birthdate: "+ noah.getBirthdate());
          }
     }
      
    }
    
}
